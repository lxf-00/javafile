package covertedstream;

public class CSDemo {
    /*
    转换流：
        字符编码：Character Encoding 就是一套自然语言的字符与二进制数之间的对应规则。
              按照某种规则，将字符存储到计算机中，称为编码 。
              将存储在计算机中的二进制数按照某种规则解析显示出来，称为解码。

      字符集 Charset： 也叫编码表。是一个系统支持的所有字符的集合，包括各国家文字、标点符号、图形符号、数字等。常见字符集有ASCII字符集、GBK字符集、Unicode字符集等。

      编码引出的问题：
        InputStreamReader类： 转换流 java.io.InputStreamReader ，是Reader的子类，是从字节流到字符流的桥梁，它读取字节，并使用指定
            的字符集将其解码为字符。它的字符集可以由名称指定，也可以接受平台的默认字符集。

            构造方法：
                InputStreamReader(InputStream in) : 创建一个使用默认字符集的字符流。
                InputStreamReader(InputStream in, String charsetName) : 创建一个指定字符集的字符流。

       OutputStreamWriter类：转换流 java.io.OutputStreamWriter ，是Writer的子类，是从字符流到字节流的桥梁。使用指定的字符集将字符
            编码为字节。它的字符集可以由名称指定，也可以接受平台的默认字符集。

            构造方法：
                OutputStreamWriter(OutputStream in) : 创建一个使用默认字符集的字符流。
                OutputStreamWriter(OutputStream in, String charsetName) : 创建一个指定字符集的字符流。
     */
}
