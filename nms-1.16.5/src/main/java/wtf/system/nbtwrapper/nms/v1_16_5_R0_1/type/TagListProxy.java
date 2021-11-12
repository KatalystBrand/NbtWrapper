package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTBase;
import net.minecraft.server.v1_16_R3.NBTTagList;
import wtf.system.nbtwrapper.NbtType;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.WrapperProxyBase;
import wtf.system.nbtwrapper.type.TagCompound;
import wtf.system.nbtwrapper.type.TagList;

public class TagListProxy implements TagList, WrapperProxyBase {

  private final NBTTagList proxy;

  public TagListProxy(NBTTagList proxy) {
    this.proxy = proxy;
  }

  @Override
  public void add(NbtType value) {
    proxy.add(WrapperProxyBase.nmsFromProxy(value));
  }

  @Override
  public void add(int index, NbtType value) {
    proxy.add(index, WrapperProxyBase.nmsFromProxy(value));
  }

  @Override
  public void set(int index, NbtType value) {
    proxy.set(index, WrapperProxyBase.nmsFromProxy(value));
  }

  @Override
  public NbtType remove(int index) {
    return WrapperProxyBase.proxyFromNms(proxy.remove(index));
  }

  @Override
  public boolean isEmpty() {
    return proxy.isEmpty();
  }

  @Override
  public TagCompound getCompound(int index) {
    return new TagCompoundProxy(proxy.getCompound(index));
  }

  @Override
  public int[] getIntArray(int index) {
    return proxy.f(index);
  }

  @Override
  public double getDouble(int index) {
    return proxy.getDoubleAt(index);
  }

  @Override
  public float getFloat(int index) {
    return proxy.i(index);
  }

  @Override
  public String getString(int index) {
    return proxy.getString(index);
  }

  @Override
  public NbtType get(int index) {
    return WrapperProxyBase.proxyFromNms(proxy.get(index));
  }

  @Override
  public int size() {
    return proxy.size();
  }

  @Override
  public TagList clone() {
    return new TagListProxy(proxy.clone());
  }

  @Override
  public NBTBase getNmsBase() {
    return proxy;
  }
}
