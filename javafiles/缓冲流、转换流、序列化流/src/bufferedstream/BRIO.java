package bufferedstream;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class BRIO {
    /*
    练习:文本排序(BRIOfile)
     */
    public static void main(String[] args){
        // 创建map集合保存： key 序号  value 文本内容
        HashMap<String, String> lineMap = new HashMap<>();

        // 创建缓冲写入写出流
        try(BufferedReader br = new BufferedReader(new FileReader("/Users/lxf/Desktop/test.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("./test.txt", true))){
            // 逐行读取文本
            String line;
            String value;
            String key;
            List<String> keyList = new ArrayList<>();
            List<String> valueList = new ArrayList<>();

            while((line = br.readLine()) != null) {
                // 解析文本
                char c = line.charAt(0);
               if(Character.isDigit(c)){
                   String[] split = line.split("\\.");
                   keyList.add(split[0]);
                   valueList.add(split[1]);
                   lineMap.put(split[0], split[1]);
               }else{
                   key = keyList.get(keyList.size() - 1);
                   value = lineMap.get(key).concat(line);
                   lineMap.put(key, value);
               }
            }
            // 遍历集合：输出
            for(String s: lineMap.keySet()){
                bw.write(s + "." + lineMap.get(s));
                bw.newLine();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
