package set的实现;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * ClassName MyTreeSet
 * Description TODO
 * Author 30712
 * Date 2020-10-30
 * Time 21:15
 */
//实现Set接口
public class MyTreeSet implements Set<Integer> {
   private TreeNode root;
   private int size;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return  size==0;
    }

    @Override
    //实际上就是搜索树的查找操作
    public boolean contains(Object o) {
        //将o转为Comparable类型
       Comparable<Integer> comparable = (Comparable<Integer>) o;
       TreeNode current = root;
       while (current != null) {
           int cmp = comparable.compareTo(current.key);
           if(cmp == 0) {
               return true;
           }else if(cmp < 0) {
               current = current.left;
           }else {
               current = current.right;
           }
       }
       return false;
    }

    @Override
    //实际上就是搜索树的插入操作
    public boolean add(Integer integer) {
        if(root == null) {
            root = new TreeNode(integer);
            size++;
            return true;
        }
        TreeNode parent  = null;
        TreeNode current = root;
        int cmp =0;
        while (current != null) {
            cmp = integer.compareTo(current.key);
            if(cmp == 0) {
                return false;
            }else if(cmp < 0) {
                parent = current;
                current = current.left;
            }else {
                parent = current;
                current = current.right;
            }
        }
        if(cmp < 0) {
            parent.left = new TreeNode(integer);
        }else{
            parent.right = new TreeNode(integer);
        }
        size++;
        return true;
    }
    @Override
    public boolean remove(Object o) {

        return false;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
       throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }
}
