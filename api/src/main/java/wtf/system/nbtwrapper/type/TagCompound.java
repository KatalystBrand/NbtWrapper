package wtf.system.nbtwrapper.type;

import java.util.Set;
import wtf.system.nbtwrapper.NbtType;

public interface TagCompound extends NbtType {

  Set<String> keySet();

  void set(String key, NbtType value);

  void setByte(String key, byte value);

  void setShort(String key, short value);

  void setInt(String key, int value);

  void setLong(String key, long value);

  void setFloat(String key, float value);

  void setDouble(String key, double value);

  void setString(String key, String value);

  void setByteArray(String key, byte[] value);

  void setIntArray(String key, int[] value);

  void setBoolean(String key, boolean value);

  NbtType get(String key);

  byte getTypeId(String key);

  boolean hasKey(String key);

  boolean hasKeyOfType(String key, int typeId);

  byte getByte(String key);

  short getShort(String key);

  int getInt(String key);

  long getLong(String key);

  float getFloat(String key);

  double getDouble(String key);

  String getString(String key);

  byte[] getByteArray(String key);

  int[] getIntArray(String key);

  TagCompound getCompound(String key);

  TagList getList(String key, int typeId);

  boolean getBoolean(String key);

  void remove(String key);

  boolean isEmpty();

  default byte getTypeId() {
    return NbtType.TYPE_COMPOUND;
  }

  TagCompound newTagCompound();

  TagCompound clone();

}
