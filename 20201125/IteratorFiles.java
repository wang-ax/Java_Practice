package chapter6;

import java.io.File;

/**
 * ClassName chapter6
 * Description TODO 遍历C盘根目录下的文件夹
 * Author 30712
 * Date 2020-11-25
 * Time 19:47
 */
public class IteratorFiles {
    public static void main(String[] args) {

        File file = new File("C:\\SQL2019");//获取一个目录对象，C盘根目录下的SQL2019文件夹

        if (file.exists()) {
            String[] files = file.list();// 获取目录下的文件和目录的名称
            for(String fileName :files) {
                System.out.println(fileName);
            }
            System.out.println("******************");
            File[] subFiles = file.listFiles();//获取文件列表
            for (File f :subFiles) {
                if(f.isDirectory()) {
                    //如果是文件夹
                    System.out.println("文件夹|-"+f.getName());
                }else {
                    //如果是文件
                    System.out.println("文件-"+f.getName());
                }
            }
        }else {
            System.out.println("There is no files and dirs!");
        }
    }
}
