package 自定义哈希表;

/**
 * ClassName TestCase
 * Description TODO
 * Author 30712
 * Date 2020-11-06
 * Time 21:19
 */
public class TestCase {
    public static void main(String[] args) {
        int[] element ={103,23,45,6,7,9,32,45};
        MyHashTable hashTable = new MyHashTable();
        for(int e : element) {
            hashTable.insert(e);
        }
    }


}
