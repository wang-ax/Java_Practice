package MyArrayList;

import java.util.Arrays;

/**
 * ClassName MyArrayList
 * Description TODO
 * Author 30712
 * Date 2020-11-07
 * Time 11:52
 */
public class MyArrayList {
        public int[] elem;//默认是null
        public int usedSize;

        public MyArrayList() {
            this.elem =new int[5];
            this.usedSize = 0;
        }

        // 打印顺序表
        public void display() {
            for(int i =0;i< this.usedSize ;i++) {
                System.out.print(this.elem[i] + " ");
            }
            System.out.println();
        }

        // 在 pos 位置新增元素
        public void add(int pos, int data) {
            //不能跳着放数据
            //1.判断pos位置是否合法，只有合法才能放入
            //2.移动数据
            if(pos < 0 || pos >this.usedSize){
                System.out.println("该位置不合法！");;
                return;
            }
            //扩容
            if(this.usedSize == this.elem.length) {
                this.elem = Arrays.copyOf(this.elem,2*elem.length);
            }
            for(int i = this.usedSize-1;i>=pos ;i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }

        // 判定是否包含某个元素
        public boolean contains(int toFind) {
            for(int i = 0 ;i< this.usedSize ;i++) {
                if(this.elem[i] == toFind){
                    return true;
                }
            }
            return false;
        }

        // 查找某个元素对应的位置
        public int search(int toFind) {
            for(int i = 0 ;i< this.usedSize ;i++) {
                if(this.elem[i] == toFind){
                    return i;
                }
            }
            return -1;
        }

        // 获取 pos 位置的元素
        public int getPos(int pos) {
            if(pos < 0 || pos >= this.usedSize) {
                return -1;
            }
           return this.elem[pos];
        }

        // 给 pos 位置的元素设为 value
        public void setPos(int pos, int value) {
            if(pos < 0 || pos >= this.usedSize) {
                return ;
            }
            this.elem[pos] =value;
        }

        //删除第一次出现的关键字key
        public void remove(int toRemove) {
            //1.找到是否有要删除的元素
            //2.elem[i] = elem[i+1]
            int index  = search(toRemove);
            if(index == -1) {
                System.out.println("没有该数字");
                return;
            }
            for(int i = index;i<this.usedSize-1;i++) {
                this.elem[i] = this.elem[i+1];
            }
            usedSize--;
            }

        // 获取顺序表长度
        public int size() {
            return this.usedSize;
        }

        // 清空顺序表
        public void clear() {
            this.usedSize =0;//没有有效数据了

            //如果数组中存在的是引用类型
            /*for(int i = 0;i< usedSize;i++) {
                elem[i] = null;
            }*/
        }
    }

