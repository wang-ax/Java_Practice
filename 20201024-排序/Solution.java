/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-04-12
 * Time 15:18
 */
public class Solution {
    public static void  quickSort(int[] array){
       quickSortInteral(array,0,array.length-1);
    }

    private static void quickSortInteral(int[] array, int i, int j) {
        if (i > j){
            return;
        }
        int keyIndex= paration(array,i,j);

        quickSortInteral(array,i,keyIndex-1);

        quickSortInteral(array,keyIndex+1,j);
    }
//分成两个区间
    private static int paration(int[] array, int lowIndex, int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;

        int key = array[lowIndex];//选基准数
        while (leftIndex < rightIndex){
            //从右边开始遇到小于的就--
            while (leftIndex < rightIndex  &&  array[rightIndex] >= key){
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];

            while (leftIndex < rightIndex && array[leftIndex] <= key){
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
        }

        array[leftIndex] = key;

        return leftIndex;
    }

    public static void main(String[] args) {
        int[] array ={3,4,6,2,1};
        quickSort(array);
        for (int i : array){
            System.out.println(i);
        }
    }
}
