package Class;

public class RoleDemo {
    public static void main(String[] args){
        Role r = new Role();
        r.setName("盖伦");
        r.setHp(56);
        Armour ar = new Armour(45);
        r.setAr(ar);
        Weapon wp = new Weapon("屠龙刀", 56);
        r.useWeapon(wp);
        r.useArmour();
    }
}
