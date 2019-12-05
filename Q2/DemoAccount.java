package prog2;

public class DemoAccount {
    public static void main(String[] args) {
        Account acc1 = Account.getInput();
        System.out.println(acc1);
        acc1.deposit(1000);

        System.out.println(acc1);
        acc1.withDraw(300);
        System.out.println(acc1);
    }


}
