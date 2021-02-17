/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-17
 * Time 13:02
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        /**
         * 递归
         */
        /*if(target ==1){
          return 1;
        }
         return 2*JumpFloorII(target-1);*/

        /**
         * 动态规划
         */
        if(target == 0){
            return 0;
        }
        /*int ret =1;
        for(int i =2;i<=target;++i){
            ret *= 2;
        }
        return ret;*/
        return 1 << (target-1);//左移相当于给这个数乘2
    }

    public static void main(String[] args) {
        JumpFloorII j = new JumpFloorII();
        System.out.println(j.JumpFloorII(4));
    }
}
