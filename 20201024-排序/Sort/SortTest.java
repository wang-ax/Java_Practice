package Sort;


public class SortTest {
    public interface SortMethod{
        String sortName();
        void sort(long[] array);
    }

    public static  class 冒泡排序 implements SortMethod {

        @Override
        public String sortName() {
            return "冒泡排序";
        }

        @Override
        public void sort(long[] array) {
            Sort.bubbleSort(array);
        }
    }
    public static class 堆排序 implements SortMethod {

        @Override
        public String sortName() {
            return "堆排序";
        }

        @Override
        public void sort(long[] array) {
            Sort.heapSort(array);
        }
    }
    public static class 插入排序 implements SortMethod {

        @Override
        public String sortName() {
            return "插入排序";
        }

        @Override
        public void sort(long[] array) {
            Sort.insertSort(array);
        }
    }
    public static class 选择排序 implements SortMethod {

        @Override
        public String sortName() {
            return "选择排序";
        }

        @Override
        public void sort(long[] array) {
            Sort.selectSort(array);
        }
    }
    public static class 希尔排序 implements SortMethod {

        @Override
        public String sortName() {
            return "希尔排序";
        }

        @Override
        public void sort(long[] array) {
            Sort.shellSort(array);
        }
    }


    public static void main(String[] args) {
        SortMethod[] methods = {
                new 冒泡排序(),
                new 堆排序(),
                new 插入排序(),
                new 选择排序(),
                new 希尔排序()
        };

        for(SortMethod sortMethod :methods) {
            System.out.println("当前测试的是"+sortMethod.sortName());
            //long[] array = Sort.构建随机数组_带个数(100000);
            long[] array = Sort.构建完全有序数组_带个数(100000);
            long begin = System.currentTimeMillis();
            sortMethod.sort(array);
            long end = System.currentTimeMillis();
            long 耗时 = end - begin;
            System.out.println(耗时);
        }
    }
}
