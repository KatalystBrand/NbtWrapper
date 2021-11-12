package wtf.system.nbtwrapper.type;

import wtf.system.nbtwrapper.NbtNumber;
import wtf.system.nbtwrapper.NbtType;

public interface TagFloat extends NbtNumber {

  default byte getTypeId() {
    return NbtType.TYPE_FLOAT;
  }

  TagFloat clone();

}
