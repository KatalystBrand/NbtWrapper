package wtf.system.nbtwrapper.type;

import wtf.system.nbtwrapper.NbtNumber;
import wtf.system.nbtwrapper.NbtType;

public interface TagByte extends NbtNumber {

  default byte getTypeId() {
    return NbtType.TYPE_BYTE;
  }

  TagByte clone();

}
