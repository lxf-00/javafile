package ComprehensiveCase;

public class User {
    // 用户类---父类（群主，成员为其子类）
    // 成员变量
    // 用户
    private String username;
    // 余额
    private double balance;

    // 构造方法
    public User(){}
    public User(String username, double balance){
        this.username = username;
        this .balance = balance;
    }

    // get/set 方法
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    // 显示余额的方法
    public void show(){
        System.out.println("用户名：" + username + "; 余额：" + balance);
    }
}
