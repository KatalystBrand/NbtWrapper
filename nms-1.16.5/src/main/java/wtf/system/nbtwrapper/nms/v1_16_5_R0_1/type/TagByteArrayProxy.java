package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTBase;
import net.minecraft.server.v1_16_R3.NBTTagByteArray;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.WrapperProxyBase;
import wtf.system.nbtwrapper.type.TagByteArray;

public class TagByteArrayProxy implements TagByteArray, WrapperProxyBase {

  private final NBTTagByteArray proxy;

  public TagByteArrayProxy(byte[] data) {
    proxy = new NBTTagByteArray(data);
  }

  public TagByteArrayProxy(NBTTagByteArray proxy) {
    this.proxy = proxy;
  }

  @Override
  public byte[] getBytes() {
    return proxy.getBytes();
  }

  @Override
  public int size() {
    return proxy.size();
  }

  @Override
  public TagByteArray clone() {
    return new TagByteArrayProxy((NBTTagByteArray) proxy.clone());
  }

  public int hashCode(){
    return proxy.hashCode();
  }

  @Override
  public NBTBase getNmsBase() {
    return proxy;
  }

}
