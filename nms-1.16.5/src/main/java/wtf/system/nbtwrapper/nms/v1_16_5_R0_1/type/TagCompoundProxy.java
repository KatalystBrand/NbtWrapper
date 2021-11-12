package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import java.util.Set;
import net.minecraft.server.v1_16_R3.NBTBase;
import net.minecraft.server.v1_16_R3.NBTTagCompound;
import org.apache.commons.lang.Validate;
import wtf.system.nbtwrapper.NbtType;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.WrapperProxyBase;
import wtf.system.nbtwrapper.type.TagCompound;
import wtf.system.nbtwrapper.type.TagList;

public class TagCompoundProxy implements TagCompound, WrapperProxyBase {

  private final NBTTagCompound proxy;

  public TagCompoundProxy(NBTTagCompound proxy) {
    this.proxy = proxy;
  }

  @Override
  public Set<String> keySet() {
    return proxy.getKeys();
  }

  @Override
  public void set(String key, NbtType value) {
    Validate.isTrue(value instanceof WrapperProxyBase, "Invalid NbtType specified");
    proxy.set(key, WrapperProxyBase.nmsFromProxy(value));
  }

  @Override
  public void setByte(String key, byte value) {
    proxy.setByte(key, value);
  }

  @Override
  public void setShort(String key, short value) {
    proxy.setShort(key, value);
  }

  @Override
  public void setInt(String key, int value) {
    proxy.setInt(key, value);
  }

  @Override
  public void setLong(String key, long value) {
    proxy.setLong(key, value);
  }

  @Override
  public void setFloat(String key, float value) {
    proxy.setFloat(key, value);
  }

  @Override
  public void setDouble(String key, double value) {
    proxy.setDouble(key, value);
  }

  @Override
  public void setString(String key, String value) {
    proxy.setString(key, value);
  }

  @Override
  public void setByteArray(String key, byte[] value) {
    proxy.setByteArray(key, value);
  }

  @Override
  public void setIntArray(String key, int[] value) {
    proxy.setIntArray(key, value);
  }

  @Override
  public void setBoolean(String key, boolean value) {
    proxy.setBoolean(key, value);
  }

  @Override
  public NbtType get(String key) {
    return WrapperProxyBase.proxyFromNms(proxy.get(key));
  }

  @Override
  public byte getTypeId(String key) {
    return 0;
  }

  @Override
  public boolean hasKey(String key) {
    return false;
  }

  @Override
  public boolean hasKeyOfType(String key, int typeId) {
    return false;
  }

  @Override
  public byte getByte(String key) {
    return 0;
  }

  @Override
  public short getShort(String key) {
    return 0;
  }

  @Override
  public int getInt(String key) {
    return 0;
  }

  @Override
  public long getLong(String key) {
    return 0;
  }

  @Override
  public float getFloat(String key) {
    return 0;
  }

  @Override
  public double getDouble(String key) {
    return 0;
  }

  @Override
  public String getString(String key) {
    return null;
  }

  @Override
  public byte[] getByteArray(String key) {
    return new byte[0];
  }

  @Override
  public int[] getIntArray(String key) {
    return new int[0];
  }

  @Override
  public TagCompound getCompound(String key) {
    return null;
  }

  @Override
  public TagList getList(String key, int typeId) {
    return null;
  }

  @Override
  public boolean getBoolean(String key) {
    return false;
  }

  @Override
  public void remove(String key) {

  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public TagCompound newTagCompound() {
    return new TagCompoundProxy(new NBTTagCompound());
  }

  @Override
  public TagCompound clone() {
    return null;
  }

  @Override
  public NBTBase getNmsBase() {
    return proxy;
  }
}
