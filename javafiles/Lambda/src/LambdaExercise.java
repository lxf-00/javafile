public class LambdaExercise {
    /*
    给定一个厨子 Cook 接口，内含唯一的抽象方法 makeFood ，且无参数、无返回值
     */
    public static void main(String[] args) {
        // TODO 请在此使用Lambda【标准格式】调用invokeCook方法
        invokeCook(() ->{
            System.out.println("吃饭了.....");
        });

        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了....");
            }
        });

        Cook c = new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了....");
            }
        };
        invokeCook(c);
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}



// 定义接口
interface Cook{
    public abstract void makeFood();
}
