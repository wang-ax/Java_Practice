package chapter6;

import java.io.File;
import java.io.IOException;

/**
 * ClassName chapter6
 * Description TODO 在c盘根目录下建立文件a.dat和文件夹 mydir,，并打印输出其是否存在
 * Author 30712
 * Date 2020-11-25
 * Time 19:16
 */


public class FileCreateAndDelete {
    public static void main(String[] args) {
        //创建一个文件类型的对象
        File file = new File("a.dat");
        File dir = new File("C://mydir");

        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件夹是否存在："+dir.exists());

        if(!file.exists()) {
            try {
                file.createNewFile();//创建文件
            } catch (IOException e) {
                e.printStackTrace();//打印出异常信息在程序中出错的位置及原因
            }
        }
        if(!dir.exists()){
            //mkdir() 创建该目录下的抽象路径名
                dir.mkdir();//创建一个文件夹
        }
        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件夹是否存在："+dir.exists());

        //获取创建文件的路径(绝对路径)
        //返回绝对路径名的字符串
        System.out.println("文件的绝对路径是：" +file.getAbsolutePath());
        System.out.println("文件夹的绝对路径是：" + dir.getAbsolutePath());

        //删除文件
        file.delete();
        System.out.println("文件是否存在："+file.exists());//false

    }
}
