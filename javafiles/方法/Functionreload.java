public class Functionreload {
    public static void main(String[] args){
        // 方法重载
        // 同一个类中允许同一个方法名重复出现，只要求参数不同（个数不同，数据类型不同，顺序不同）；与修饰符和返回值类型无关；
        reload1();
        reload1(3);
    }

    public static void reload1(){
        System.out.println("reload1 第一次出现！");
    }

    public static void reload1(int a){
        for (int i = 1; i <= a; i++){
            System.out.print("reload1 第二次出现");
        }
    }
}
