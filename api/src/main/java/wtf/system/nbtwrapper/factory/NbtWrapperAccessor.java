package wtf.system.nbtwrapper.factory;

import java.lang.reflect.InvocationTargetException;
import org.bukkit.Bukkit;

public final class NbtWrapperAccessor {

  public final static String NBT_KEY = "Bukkit.NBTWrapper"; // DO NOT CHANGE

  private static NmsTypeModifier modifier;
  private static NmsTypeFactory typeFactory;

  private NbtWrapperAccessor() {

  }

  public static NmsTypeModifier getModifier() {
    if (modifier == null) {
      Object modifierFactory = createFactory("TypeModifier");
      if (modifierFactory instanceof NmsTypeModifier) {
        modifier = (NmsTypeModifier) modifierFactory;
      } else {
        throw new IllegalStateException("Incorrect factory created");
      }
    }

    return modifier;
  }

  public static NmsTypeFactory getTypeFactory() {
    if (typeFactory == null) {
      Object typeFactoryInstance = createFactory("TypeFactory");
      if (typeFactoryInstance instanceof NmsTypeFactory) {
        typeFactory = (NmsTypeFactory) typeFactoryInstance;
      } else {
        throw new IllegalStateException("Incorrect factory created");
      }
    }

    return typeFactory;
  }

  private static Object createFactory(String name) {
    String nmsVersion = getNmsPackageName();
    Class<?> factoryClass;

    try {
      factoryClass = Class.forName(
          "wtf.system.nbtwrapper.nms.v" + nmsVersion + ".factory." + name);
    } catch (ClassNotFoundException e) {
      throw new IllegalArgumentException(
          "Invalid factory name or unsupported nms version " + nmsVersion + "/" + name, e);
    }

    Object factoryObject;

    try {
      factoryObject = factoryClass.getConstructor().newInstance();
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
      throw new IllegalStateException("Issue while constructing factory " + name, e);
    }

    return factoryObject;
  }

  private static String getNmsPackageName() {
    String bukkitVersion = Bukkit.getServer().getBukkitVersion();
    int snapShotIndex = bukkitVersion.indexOf("-SNAPSHOT");
    if (snapShotIndex != -1) {
      bukkitVersion = bukkitVersion.substring(0, snapShotIndex);
    }

    return bukkitVersion.replace(".", "_").replace("-", "_");
  }


}
