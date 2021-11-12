package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTBase;
import net.minecraft.server.v1_16_R3.NBTTagString;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.WrapperProxyBase;
import wtf.system.nbtwrapper.type.TagString;

public class TagStringProxy implements TagString, WrapperProxyBase {

  private final NBTTagString proxy;

  public TagStringProxy(String data) {
    proxy = NBTTagString.a(data);
  }

  public TagStringProxy(NBTTagString proxy) {
    this.proxy = proxy;
  }

  @Override
  public String asString() {
    return proxy.toString();
  }

  @Override
  public int hashCode() {
    return proxy.hashCode();
  }

  @Override
  public String toString() {
    return proxy.toString();
  }

  @Override
  public NBTBase getNmsBase() {
    return proxy;
  }

  @Override
  public TagString clone() {
    return this;
  }

}
