package 排序;

/**
 * ClassName 排序
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 19:34
 */
public class BubbleSort {
    public void  bubbleSort(int[] array){
        for (int i = 0;i< array.length-1;i++){
            for (int j = 0;j < array.length-i-1;j++){
                if (array[j] > array[j+1]){//相等不交换，保证稳定性
                    swap(array,j,j+1);
                }
            }
        }
    }

    private void swap(int[] array, int j, int i) {
        int temp =array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
