package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTTagShort;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.NbtNumberProxy;
import wtf.system.nbtwrapper.type.TagShort;

public class TagShortProxy extends NbtNumberProxy<NBTTagShort> implements TagShort {

  public TagShortProxy(short data){
    super(NBTTagShort.a(data));
  }

  public TagShortProxy(NBTTagShort proxy) {
    super(proxy);
  }

  @Override
  public TagShort clone() {
    return this;
  }

}
