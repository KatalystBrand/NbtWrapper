package wtf.system.nbtwrapper.nms.v1_16_5_R0_1.type;

import net.minecraft.server.v1_16_R3.NBTTagInt;
import wtf.system.nbtwrapper.nms.v1_16_5_R0_1.NbtNumberProxy;
import wtf.system.nbtwrapper.type.TagInt;

public class TagIntProxy extends NbtNumberProxy<NBTTagInt> implements TagInt {

  public TagIntProxy(int data){
    super(NBTTagInt.a(data));
  }

  public TagIntProxy(NBTTagInt proxy) {
    super(proxy);
  }

  @Override
  public TagInt clone() {
    return this;
  }
}
