package wtf.system.nbtwrapper.nms.v1_16_5_R0_1;

import net.minecraft.server.v1_16_R3.NBTBase;
import wtf.system.nbtwrapper.NbtNumber;
import wtf.system.nbtwrapper.NbtType;

public class NbtNumberProxy<T extends net.minecraft.server.v1_16_R3.NBTNumber>
    implements NbtNumber, WrapperProxyBase {

  private final T proxy;

  public NbtNumberProxy(T proxy) {
    this.proxy = proxy;
  }

  @Override
  public long asLong() {
    return proxy.asLong();
  }

  @Override
  public int asInt() {
    return proxy.asInt();
  }

  @Override
  public short asShort() {
    return proxy.asShort();
  }

  @Override
  public byte asByte() {
    return proxy.asByte();
  }

  @Override
  public double asDouble() {
    return proxy.asDouble();
  }

  @Override
  public float asFloat() {
    return proxy.asFloat();
  }

  @Override
  public Number asNumber() {
    return proxy.k();
  }

  @Override
  public byte getTypeId() {
    return proxy.getTypeId();
  }

  @Override
  public NbtType clone() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString(){
    return proxy.toString();
  }

  @Override
  public int hashCode(){
    return proxy.hashCode();
  }

  @Override
  public NBTBase getNmsBase() {
    return proxy;
  }

}
