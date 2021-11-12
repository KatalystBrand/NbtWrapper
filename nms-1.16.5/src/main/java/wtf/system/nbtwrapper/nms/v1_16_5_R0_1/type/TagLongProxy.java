package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTTagLong;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.NbtNumberProxy;
import wtf.system.nbtwrapper.type.TagLong;

public class TagLongProxy extends NbtNumberProxy<NBTTagLong> implements TagLong {

  public TagLongProxy(long data){
    super(NBTTagLong.a(data));
  }

  public TagLongProxy(NBTTagLong proxy) {
    super(proxy);
  }

  @Override
  public TagLong clone() {
    return this;
  }

}
