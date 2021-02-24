package java1;

import java.util.List;

/**
 * ClassName java1
 * Description TODO
 * Author 30712
 * Date 2021-02-24
 * Time 16:25
 */
public class DAOTest {
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);

        StudentDAO dao2 = new StudentDAO();
        dao2.add(new Student());
        Student student = dao2.getIndex(1);
        List<Student> list1 = dao2.getForList(5);

    }
}
