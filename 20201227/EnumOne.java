/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2020-12-27
 * Time 22:05
 */
//枚举
enum AccountType
{
    SAVING, FIXED, CURRENT;

    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
 public  class EnumOne {
    public static void main(String[]args) {
        System.out.println(AccountType.FIXED);
    }
}