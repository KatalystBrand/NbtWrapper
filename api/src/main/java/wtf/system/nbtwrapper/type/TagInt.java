package wtf.system.nbtwrapper.type;

import wtf.system.nbtwrapper.NbtNumber;
import wtf.system.nbtwrapper.NbtType;

public interface TagInt extends NbtNumber {

  default byte getTypeId() {
    return NbtType.TYPE_INT;
  }

  TagInt clone();

}
