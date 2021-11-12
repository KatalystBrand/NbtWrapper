package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTTagByte;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.NbtNumberProxy;
import wtf.system.nbtwrapper.type.TagByte;

public class TagByteProxy extends NbtNumberProxy<NBTTagByte> implements TagByte {

  public TagByteProxy(byte data) {
    super(NBTTagByte.a(data));
  }

  public TagByteProxy(NBTTagByte proxy) {
    super(proxy);
  }

  @Override
  public TagByte clone() {
    return this;
  }
}
