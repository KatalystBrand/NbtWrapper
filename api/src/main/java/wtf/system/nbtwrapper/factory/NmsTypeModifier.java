package wtf.system.nbtwrapper.factory;

import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import wtf.system.nbtwrapper.type.TagCompound;

public interface NmsTypeModifier {

  boolean isItemPrepared(ItemStack stack);

  ItemStack prepareItemStack(ItemStack item);

  TagCompound getTagCompound(ItemStack item);

  TagCompound getOrCreateTagCompound(ItemStack item);

  TagCompound getTagCompound(Block block);

  TagCompound getOrCreateTagCompound(Block block);

}
