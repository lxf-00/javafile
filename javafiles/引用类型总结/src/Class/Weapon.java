package Class;

public class Weapon {
    private String name;
    private int hurt;

    // 构造函数
    public Weapon(){}
    public Weapon(String name, int hurt){
        this.name = name;
        this.hurt = hurt;
    }


    // get/set 方法
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHurt(int hurt){
        this.hurt = hurt;
    }

    public int getHurt(){
        return hurt;
    }
}
