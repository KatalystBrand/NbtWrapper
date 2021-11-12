package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.factory;

import net.minecraft.server.v1_16_R3.NBTTagCompound;
import net.minecraft.server.v1_16_R3.TileEntity;
import net.minecraft.server.v1_16_R3.TileEntityJukeBox;
import org.apache.commons.lang.Validate;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_16_R3.block.CraftBlock;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import wtf.system.nbtwrapper.factory.NbtWrapperAccessor;
import wtf.system.nbtwrapper.factory.NmsTypeModifier;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagCompoundProxy;
import wtf.system.nbtwrapper.type.TagCompound;

public class TypeModifier implements NmsTypeModifier {

  @Override
  public boolean isItemPrepared(ItemStack item) {
    return item instanceof CraftItemStack;
  }

  @Override
  public ItemStack prepareItemStack(ItemStack item) {
    return item instanceof CraftItemStack ? item
        : CraftItemStack.asCraftMirror(CraftItemStack.asNMSCopy(item));
  }

  @Override
  public TagCompound getTagCompound(ItemStack item) {
    return getTagCompound(item, false);
  }

  @Override
  public TagCompound getOrCreateTagCompound(ItemStack item) {
    return getTagCompound(item, true);
  }

  @Override
  public TagCompound getTagCompound(Block block) {
    return null;
  }

  @Override
  public TagCompound getOrCreateTagCompound(Block block) {
    return null;
  }

  private TagCompound getTagCompound(ItemStack item, boolean create) {
    Validate.isTrue(isItemPrepared(item), "Provided ItemStack is unprepared");
    net.minecraft.server.v1_16_R3.ItemStack nmsStack = ((CraftItemStack) item).getHandle();
    NBTTagCompound nmsCompound = create ? nmsStack.getOrCreateTag() : nmsStack.getTag();

    if (nmsCompound == null) {
      return null;
    }

    NBTTagCompound nmsWrapperTag = nmsCompound.getCompound(NbtWrapperAccessor.NBT_KEY);

    if (nmsWrapperTag == null && create) {
      nmsCompound.set(NbtWrapperAccessor.NBT_KEY, nmsWrapperTag = new NBTTagCompound());
    }

    return nmsWrapperTag == null ? null : new TagCompoundProxy(nmsWrapperTag);
  }

}
