package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTTagFloat;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.NbtNumberProxy;
import wtf.system.nbtwrapper.type.TagFloat;

public class TagFloatProxy extends NbtNumberProxy<NBTTagFloat> implements TagFloat {

  public TagFloatProxy(float data) {
    super(NBTTagFloat.a(data));
  }

  public TagFloatProxy(NBTTagFloat proxy) {
    super(proxy);
  }

  @Override
  public TagFloat clone() {
    return this;
  }
}
