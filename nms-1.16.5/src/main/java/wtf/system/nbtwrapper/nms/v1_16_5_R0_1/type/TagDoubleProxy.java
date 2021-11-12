package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTTagDouble;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.NbtNumberProxy;
import wtf.system.nbtwrapper.type.TagDouble;

public class TagDoubleProxy extends NbtNumberProxy<NBTTagDouble> implements TagDouble {

  public TagDoubleProxy(double data) {
    super(NBTTagDouble.a(data));
  }

  public TagDoubleProxy(NBTTagDouble proxy) {
    super(proxy);
  }

  @Override
  public TagDouble clone() {
    return this;
  }
}
