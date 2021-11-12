package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTBase;
import net.minecraft.server.v1_16_R3.NBTTagIntArray;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.WrapperProxyBase;
import wtf.system.nbtwrapper.type.TagIntArray;

public class TagIntArrayProxy implements TagIntArray, WrapperProxyBase {

  private final NBTTagIntArray proxy;

  public TagIntArrayProxy(NBTTagIntArray proxy) {
    this.proxy = proxy;
  }

  public TagIntArrayProxy(int[] data) {
    this.proxy = new NBTTagIntArray(data);
  }

  @Override
  public int[] getInts() {
    return proxy.getInts();
  }

  @Override
  public int size() {
    return proxy.size();
  }

  @Override
  public TagIntArray clone() {
    return new TagIntArrayProxy(proxy.clone());
  }

  @Override
  public int hashCode(){
    return proxy.hashCode();
  }

  @Override
  public NBTBase getNmsBase() {
    return proxy;
  }
}
