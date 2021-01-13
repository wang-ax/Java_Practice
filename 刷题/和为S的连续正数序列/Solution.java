package 和为S的连续正数序列;

import java.util.ArrayList;

/**
 * ClassName 和为S的连续正数序列
 * Description TODO
 * Author 30712
 * Date 2021-01-13
 * Time 10:42
 */
public class Solution {
    public  static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        //和为S的连续正数序列
        //等差数列的和
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        //最少是两个连续的数，说明最小值为3
        if (sum<3){//因为最少两个数，所以最小为3
            return res;
        }

        int start=1,end=2,mid=(1+sum)/2;//mid用于缩小范围，序列起始位置从元素1,2开始
        int curSum=start+end;//记录当前序列和
        while (start<mid){//判断终止条件
            if (curSum==sum){
                res.add(getSequence(start,end));
            }
            while (curSum>sum&&start<mid){//当前序列和大于sum
                curSum-=start;
                start++;
                if (curSum==sum){
                    res.add(getSequence(start,end));
                }
            }
            end++;//当前序列和小于sum
            curSum+=end;
        }
        return res;

    }

    public  static ArrayList<Integer> getSequence(int start,int end){
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i=start;i<=end;i++){
            temp.add(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        Solution test=new Solution();
        ArrayList<ArrayList<Integer>> res=test.FindContinuousSequence(9);
        System.out.println(res);
    }
}
