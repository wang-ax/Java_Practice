package quicksort;

import java.util.Arrays;
import java.util.Random;

public class BuildArray {
    //构建随机数组
    public static long[] 构建随机数组() {
        //固定随机种子，每次生成的数是完全一样的
        Random random = new Random(20201020);
        //构建一个有十个元素的数组
        long[] array = new long[10];
        for(int i = 0;i< array.length;i++) {
            //生成1-100的随机数
            array[i] = random.nextInt(100);
        }
        return array;
    }
    //构建有序的数组
    public static long[] 构建完全有序数组() {
        long[] array = 构建随机数组();
        Arrays.sort(array);
        return array;
    }
    //构建完全逆序数组
    public static  long[] 构建完全逆序数组() {
        long[] array =构建完全有序数组();
        //构建一个有序的数组，然后将数组进行逆序
        for (int i=0;i<(array.length+1)/2;i++)	//len 加 1 是保证当长度为奇数是也符合
        {
            //临时字符用来做交换的中间变量
            long p = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-1-i] = p;
        }
        return array;
    }
}
