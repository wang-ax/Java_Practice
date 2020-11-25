package chapter6;

import java.io.*;

/**
 * ClassName chapter6
 * Description TODO 利用文件输入/输出字节流实现文件的复制操作
 * Author 30712
 * Date 2020-11-25
 * Time 20:05
 */
public class FileCopy {
    public static void main(String[] args) throws IOException  {
        String byteFilename = "byteFile.dat";
        String copyFilename = "copyByteFile.dat";
        FileInputStream fin = new FileInputStream(byteFilename);//创建文件输入流对象
        FileOutputStream fout = new FileOutputStream(copyFilename,false);//创建文件输出流对象

        byte[] buffer = new byte[512];//字节缓冲区，需要读取的字节数组
        int count =0;
        do{
            count = fin.read(buffer);//读取输入流，读取文件中的数据
            if(count!=-1) {
                fout.write(buffer);//写入输出流，将读取到的数据写入目标文件
            }
        }while (count!=-1);//如果文件中有数据

            fin.close();//关闭输入流
            fout.close();//关闭输出流
        System.out.println("文件复制结束！");
            System.out.println("Copyfile from " + byteFilename + " to " + copyFilename);
    }
}
