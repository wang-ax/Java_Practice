package 自己实现TreeMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * ClassName MyTreeMap
 * Description TODO
 * Author 30712
 * Date 2020-10-31
 * Time 10:46
 */
//不使用接口
public class MyTreeMap {
    private TreeNode root;
    //put：实质上就是对应搜索树中的
    // 1.插入节点
    //2.修改对应节点中的value值
    public Integer put(String key,Integer value) {
        if(root == null) {
            root = new TreeNode(key,value);
            return null;
        }
        TreeNode parent = null;
        TreeNode current = root;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if(cmp == 0) {
                //如果有key，就修改对应节点中的value值，将以前的value值修改为put传进来的value
                Integer oldValue = current.value;
                current.value = value;
                return oldValue;
            }else if(cmp < 0) {
                parent = current;
                current = current.left;
            }else {
                parent = current;
                current = current.right;
            }
        }
        TreeNode node = new TreeNode(key,value);
        int cmp = key.compareTo(parent.key);
        if(cmp < 0) {
            parent.left = node;
        }else {
            parent.right = node;
        }
        return null;
    }
    //get操作：
    //对应的是搜索树中的查找操作
    public Integer get(String key) {
        TreeNode current = root;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if(cmp == 0) {
                return current.value;
            }else if(cmp < 0) {
                current = current.left;
            }else {
                current = current.right;
            }
        }
        return null;
    }
    public Integer getOrDefault(String key,Integer defaultvalue) {
        Integer v = get(key);
        if(v != null) {
            return v;
        }
        return defaultvalue;
    }

}
