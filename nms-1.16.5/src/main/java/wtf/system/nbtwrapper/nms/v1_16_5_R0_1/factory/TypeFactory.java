package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.factory;

import net.minecraft.server.v1_16_R3.NBTTagCompound;
import net.minecraft.server.v1_16_R3.NBTTagList;
import wtf.system.nbtwrapper.factory.NmsTypeFactory;
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
import wtf.system.nbtwrapper.type.TagByte;
import wtf.system.nbtwrapper.type.TagByteArray;
import wtf.system.nbtwrapper.type.TagCompound;
import wtf.system.nbtwrapper.type.TagDouble;
import wtf.system.nbtwrapper.type.TagFloat;
import wtf.system.nbtwrapper.type.TagInt;
import wtf.system.nbtwrapper.type.TagIntArray;
import wtf.system.nbtwrapper.type.TagList;
import wtf.system.nbtwrapper.type.TagLong;
import wtf.system.nbtwrapper.type.TagShort;
import wtf.system.nbtwrapper.type.TagString;

public class TypeFactory implements NmsTypeFactory {

  @Override
  public TagByte newTagByte(byte value) {
    return new TagByteProxy(value);
  }

  @Override
  public TagByteArray newTagByteArray(byte[] value) {
    return new TagByteArrayProxy(value);
  }

  @Override
  public TagCompound newTagCompound() {
    return new TagCompoundProxy(new NBTTagCompound());
  }

  @Override
  public TagDouble newTagDouble(double value) {
    return new TagDoubleProxy(value);
  }

  @Override
  public TagFloat newTagFloat(float value) {
    return new TagFloatProxy(value);
  }

  @Override
  public TagInt newTagInt(int value) {
    return new TagIntProxy(value);
  }

  @Override
  public TagIntArray newTagIntArray(int[] value) {
    return new TagIntArrayProxy(value);
  }

  @Override
  public TagList newTagList() {
    return new TagListProxy(new NBTTagList());
  }

  @Override
  public TagLong newTagLong(long value) {
    return new TagLongProxy(value);
  }

  @Override
  public TagShort newTagShort(short value) {
    return new TagShortProxy(value);
  }

  @Override
  public TagString newTagString(String value) {
    return new TagStringProxy(value);
  }

}
