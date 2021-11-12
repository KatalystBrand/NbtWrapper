package wtf.system.nbtwrapper.type;

import wtf.system.nbtwrapper.NbtType;

public interface TagString extends NbtType {

  String asString();

  default byte getTypeId() {
    return NbtType.TYPE_STRING;
  }

  TagString clone();

}
