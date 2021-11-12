package wtf.system.nbtwrapper.type;

import wtf.system.nbtwrapper.NbtType;

public interface TagList extends NbtType {

  void add(NbtType value);

  void add(int index, NbtType value);

  void set(int index, NbtType value);

  NbtType remove(int index);

  boolean isEmpty();

  TagCompound getCompound(int index);

  int[] getIntArray(int index);

  double getDouble(int index);

  float getFloat(int index);

  String getString(int index);

  NbtType get(int index);

  int size();

  default byte getTypeId() {
    return NbtType.TYPE_LIST;
  }

  TagList clone();

}
