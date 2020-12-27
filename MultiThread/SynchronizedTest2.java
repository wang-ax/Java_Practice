package test3;


public class SynchronizedTest2 {
    /**
     * 一个教室有50个座位，同时有三个老师安排同学的座位
     * 每个老师安排100个同学到这个教室。模拟使用多线程实现
     * 座位 编号为1-50,三个线程同时启动来安排同学
     * 同学可以循环操作来安排，直到座位安排满
     * @param args
     */
     private  static int COUNT  =50;
     public static void main(String[] args) {
/*
        Thread[] threads = new Thread[3];
        for (int i = 0;i<3;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j =0;j < 100;j++){
                        synchronized (SynchronizedTest2.class){
                            if (COUNT > 0){
                                System.out.println(Thread.currentThread().getName());
                                COUNT--;
                            }
                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        threads[0].setName("教师1");
        threads[1].setName("教师2");
        threads[2].setName("教师3");

        for (Thread thread : threads){
            thread.start();
        }
*/

             new Thread(new Task(10)).start();
             new Thread(new Task(20)).start();
             new Thread(new Task(20)).start();

    }

    public  static  class  Task implements  Runnable{
         private  int num =0;

        public Task(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            for (int i =0;i< 100;i++){
                synchronized (Task.class){
                    if (COUNT > 0 && num > 0){
                        COUNT--;
                        num--;
                        System.out.printf("%s:COUNT= %s,num = %s%n" , Thread.currentThread().getName(),COUNT,num);
                    }
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
