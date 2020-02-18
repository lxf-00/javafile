package Class;

public class Role {
    // class 作为成员变量
    // 定义角色类

    // 姓名
    private String name;
    // 生命值
    private int hp;
    private Armour ar;

    // 构造方法
    public Role(){}
    public Role(int hp, String name, Armour ar){
        // 创建一个对象分配一个id
        this.hp = hp;
        this.name = name;
        this.ar = ar;
    }

    // 定义相关get/set方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
    public int getHp(){
        return hp;
    }

   public void setAr(Armour ar){
        this.ar = ar;
   }
   public Armour getAr(){
        return ar;
   }

   // 定义使用武器方法
    public void useWeapon(Weapon wp){
        System.out.println(getName()+"使用" + wp.getName() + "造成了" +  wp.getHurt() + "伤害");
    }

    // 定义使用护甲
    public void useArmour(){
        System.out.println(getName() + "穿戴编号为" + ar.getCode() + "的护甲");
    }
}
