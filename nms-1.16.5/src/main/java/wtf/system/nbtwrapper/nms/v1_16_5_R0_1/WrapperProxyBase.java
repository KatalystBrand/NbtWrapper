package wtf.system.nbtwrapper.nms.v1_16_5_R0_1;

import net.minecraft.server.v1_16_R3.NBTBase;
import net.minecraft.server.v1_16_R3.NBTTagByte;
import net.minecraft.server.v1_16_R3.NBTTagByteArray;
import net.minecraft.server.v1_16_R3.NBTTagCompound;
import net.minecraft.server.v1_16_R3.NBTTagDouble;
import net.minecraft.server.v1_16_R3.NBTTagFloat;
import net.minecraft.server.v1_16_R3.NBTTagInt;
import net.minecraft.server.v1_16_R3.NBTTagIntArray;
import net.minecraft.server.v1_16_R3.NBTTagList;
import net.minecraft.server.v1_16_R3.NBTTagLong;
import net.minecraft.server.v1_16_R3.NBTTagShort;
import net.minecraft.server.v1_16_R3.NBTTagString;
import org.apache.commons.lang.Validate;
import wtf.system.nbtwrapper.NbtType;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagByteArrayProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagByteProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagCompoundProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagDoubleProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagFloatProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagIntArrayProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagIntProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagListProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagLongProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagShortProxy;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type.TagStringProxy;

public interface WrapperProxyBase {

  NBTBase getNmsBase();

  static NBTBase nmsFromProxy(NbtType proxy) {
    Validate.isTrue(proxy instanceof WrapperProxyBase, "Invalid NbtType specified");
    return ((WrapperProxyBase) proxy).getNmsBase();
  }

  static NbtType proxyFromNms(NBTBase nms) {
    if (nms == null) {
      return null;
    }

    return switch (nms.getTypeId()) {
      case NbtType.TYPE_END -> throw new UnsupportedOperationException("Type End Unsupported");
      case NbtType.TYPE_BYTE -> new TagByteProxy((NBTTagByte) nms);
      case NbtType.TYPE_SHORT -> new TagShortProxy((NBTTagShort) nms);
      case NbtType.TYPE_INT -> new TagIntProxy((NBTTagInt) nms);
      case NbtType.TYPE_LONG -> new TagLongProxy((NBTTagLong) nms);
      case NbtType.TYPE_FLOAT -> new TagFloatProxy((NBTTagFloat) nms);
      case NbtType.TYPE_DOUBLE -> new TagDoubleProxy((NBTTagDouble) nms);
      case NbtType.TYPE_BYTE_ARRAY -> new TagByteArrayProxy((NBTTagByteArray) nms);
      case NbtType.TYPE_STRING -> new TagStringProxy((NBTTagString) nms);
      case NbtType.TYPE_LIST -> new TagListProxy((NBTTagList) nms);
      case NbtType.TYPE_COMPOUND -> new TagCompoundProxy((NBTTagCompound) nms);
      case NbtType.TYPE_INT_ARRAY -> new TagIntArrayProxy((NBTTagIntArray) nms);
      default -> throw new UnsupportedOperationException("Unsupported Nbt type " + nms.getTypeId());
    };
  }

}
