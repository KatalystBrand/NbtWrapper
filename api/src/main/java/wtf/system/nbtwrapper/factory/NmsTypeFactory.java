package wtf.system.nbtwrapper.factory;

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

public interface NmsTypeFactory {

  TagByte newTagByte(byte value);

  TagByteArray newTagByteArray(byte[] value);

  TagCompound newTagCompound();

  TagDouble newTagDouble(double value);

  // public abstract TagEnd newTagEnd(); -- not required ?

  TagFloat newTagFloat(float value);

  TagInt newTagInt(int value);

  TagIntArray newTagIntArray(int[] value);

  TagList newTagList();

  TagLong newTagLong(long value);

  TagShort newTagShort(short value);

  TagString newTagString(String value);

}
