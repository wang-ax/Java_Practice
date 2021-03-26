package exceptionPratice;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-26
 * Time 19:35
 */
public class EcmDef {
    public static void main(String[] args) {
        //在main方法中进行try...catch
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            ecm(i,j);
            //使用try...catch显示处理异常
        } catch (NumberFormatException e) {
            System.out.println("输入的数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("分母为0");
        }catch (AppException e){
            System.out.println(e.getMessage());
        }
    }

    //抛出异常
    public static  void ecm(int i ,int j) throws AppException {
        if (i < 0 || j < 0){
            throw new AppException("您输入的数值存在负数");
        }
        System.out.println(i/j);
    }
}
//自定义异常
class AppException extends  Exception{
    static final long serialVersionUID = -338751931229948L;
    public AppException() {
    }
    public AppException(String message) {
        super(message);
    }
}
