package wtf.system.nbtwrapper.type;

import wtf.system.nbtwrapper.NbtNumber;
import wtf.system.nbtwrapper.NbtType;

public interface TagDouble extends NbtNumber {

  default byte getTypeId() {
    return NbtType.TYPE_DOUBLE;
  }

  TagDouble clone();

}
