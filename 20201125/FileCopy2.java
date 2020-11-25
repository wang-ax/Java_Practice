package chapter6;

import java.io.*;

/**
 * ClassName chapter6
 * Description TODO 利用字符流复制文本文件
 * Author 30712
 * Date 2020-11-25
 * Time 20:23
 */
/**
 * 字节流的顶级父类是Reader和 Writer，一个用于读取，一个用于写入
 * 对应的输入输出字符流：InputStreamReader 和 OutputStreamWriter
 * 为了方便读取，转换成缓冲字符流
 * BufferedReader 和 BufferedWriter 这两个对象可以对流进行按行读取
 */
public class FileCopy2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("FileCopy.java"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("newFileCopy.dat"));
            String line = null;
            while (line != null) ;
            {
                line = br.readLine();//按行读取数据
                if (null != line)
                    bw.write(line);//写入数据
            }
            //关闭输入输出流
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件复制结束！");
    }
}
