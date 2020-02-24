import java.io.File;


public class RecursionExercise {
    /*
    递归打印多级目录:
     */
    public static void main(String[] args) {
        // 创建File对象
        File dir = new File("/Users/lxf/Desktop/爬虫");

        // 调用方法： printDir()  传递参数： File dir  递归打印多级目录
        // printDir(dir);


        // 优化： FileFilter
        printDir2(dir);
    }

    // printDir方法定义
    private static void printDir(File dir){
        // 获取所有子目录和文件，返回File 数组
        File[] files = dir.listFiles();

        // 循环遍历，判断
        for(File f: files){
            if(f.isDirectory()){
                // 是目录，输出目录的绝对路径
                System.out.println("目录：" + f.getAbsoluteFile());

                // 递归
                printDir(f);
            }else{
                // 文件
                System.out.println("文件名：" + f.getAbsoluteFile());
            }
        }
    }

    // printDir方法定义
    private static void printDir2(File dir){
        // 获取所有子目录和文件，返回File 数组
        File[] files = dir.listFiles(f ->{
            return f.getName().endsWith(".py") || f.isDirectory();
        });

        // 循环遍历，判断
        for(File f: files){
            if(f.isFile()){
                // 文件，输出目录的绝对路径
                System.out.println("文件名：" + f.getAbsoluteFile());

            }else{
                // 递归
                printDir2(f);

            }
        }
    }
}
