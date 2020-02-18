public class RedPacketTest {
    public static void main(String[] args){
        // 创建红包对象
        RedPacket rp = new RedPacket("大红包");
        // 设置群主名称
        rp.setOwnerName("我是群主啊");
        // 发布普通红包
        rp.setOpenWay(new Common());
        // 发布手气红包
        rp.setOpenWay(new Lucky());
    }
}
