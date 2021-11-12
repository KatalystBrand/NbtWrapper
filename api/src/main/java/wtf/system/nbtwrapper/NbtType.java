package wtf.system.nbtwrapper;

public interface NbtType {

  byte TYPE_END = 0;
  byte TYPE_BYTE = 1;
  byte TYPE_SHORT = 2;
  byte TYPE_INT = 3;
  byte TYPE_LONG = 4;
  byte TYPE_FLOAT = 5;
  byte TYPE_DOUBLE = 6;
  byte TYPE_BYTE_ARRAY = 7;
  byte TYPE_STRING = 8;
  byte TYPE_LIST = 9;
  byte TYPE_COMPOUND = 10;
  byte TYPE_INT_ARRAY = 11;

  byte getTypeId();

  NbtType clone();

}
