/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-24
 * Time 22:57
 */
import java.util.Scanner;
public class Main {
    public int[] MySort (int[] arr) {
        quickSort(arr,0,arr.length-1);
        return arr;
    }
    private static void quickSort(int[] arr,int left,int right){
        if (left == right){
            return ;
        }
        if (left > right){
            return;
        }
        int key = paration(arr,left,right);
        quickSort(arr,left,key-1);
        quickSort(arr,key+1,right);
    }
    //填坑挖坑
    private static  int paration(int[] arr,int leftIndex,int rightIndex){
        int key = arr[leftIndex];
        while (leftIndex < rightIndex){
            while (leftIndex < rightIndex && arr[rightIndex] >=key){
                rightIndex--;
            }
            arr[leftIndex] = arr[rightIndex];
            while (leftIndex < rightIndex && arr[leftIndex] <= key){
                leftIndex++;
            }
            arr[rightIndex] = arr[leftIndex];
        }
        arr[leftIndex] = key;
        return leftIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Main sort = new Main();
        sort.MySort(arr);
        for (int a :arr){
            System.out.print(a+" ");
        }
    }
}