package wtf.system.nbtwrapper.type;

import wtf.system.nbtwrapper.NbtType;

public interface TagIntArray extends NbtType {

  int[] getInts();

  int size();

  default byte getTypeId() {
    return NbtType.TYPE_INT_ARRAY;
  }

  TagIntArray clone();

}
