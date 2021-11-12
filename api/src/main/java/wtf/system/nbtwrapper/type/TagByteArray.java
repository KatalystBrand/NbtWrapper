package wtf.system.nbtwrapper.type;

import wtf.system.nbtwrapper.NbtType;

public interface TagByteArray extends NbtType {

  byte[] getBytes();

  int size();

  default byte getTypeId() {
    return NbtType.TYPE_BYTE_ARRAY;
  }

  TagByteArray clone();

}
