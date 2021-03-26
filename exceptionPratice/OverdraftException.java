package exceptionPratice;

/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-03-26
 * Time 19:50
 */
//自定义异常类OverdraftException
public class OverdraftException extends  Exception{
    private double deficit;//表示所取的钱与余额的差额

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException() {
    }

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }
}
