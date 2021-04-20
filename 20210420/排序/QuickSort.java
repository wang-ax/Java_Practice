package 排序;

/**
 * ClassName 排序
 * Description TODO
 * Author 30712
 * Date 2021-04-20
 * Time 19:28
 */
//时间复杂度：最坏O(n^2),最好O(n log(n))
    //空间复杂度：O(log(n))
public class QuickSort {
    public void quicksort(int[] array){
        quicksortInteral(array,0,array.length-1);
    }

    private void quicksortInteral(int[] array, int left, int right) {
        if (left == right){
            return;
        }
        if (left > right){
            return;
        }
        int keyIndex = Partition(array,left,right);
        quicksortInteral(array,left,keyIndex-1);
        quicksortInteral(array,keyIndex+1,right);

    }

    private int Partition(int[] array, int left, int right) {
        //挖坑法
        int key = array[left];
        int i = left;
        int j = right;
        while (i < j){
            while (i < j && array[j] >= key){
                j--;
            }
            array[i] = array[j];
            while (i < j && array[i] <= key){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = key;
        return i;
    }
}
