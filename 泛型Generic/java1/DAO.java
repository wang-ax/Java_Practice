package java1;

import java.util.List;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-02-24
 * Time 16:15
 */
//data access object
public class DAO<T> {//表的共性操作的DAO
    //添加一条记录
    public void add(T t){

    }
    //删除一条记录
    public boolean remove(int index){
        return false;
    }
    //修改一条记录
    public  void update(int index,T t){

    }
    //查询一条记录
    public T getIndex(int index){
        return null;
    }
    //查询多条记录
    public List<T> getForList(int index){
        return null;
    }

    //泛型方法
    //举例：获取表中一共有多少条记录？获取最大的员工入职时间？（
    // 返回的内容不确定，所以需要使用泛型方法）
    public <E> E getValue(){
        return null;
    }
}
