package wtf.system.nbtwrapper;

public interface NbtNumber extends NbtType {

  long asLong();

  int asInt();

  short asShort();

  byte asByte();

  double asDouble();

  float asFloat();

  Number asNumber();

}
