package prog2;

import java.util.Scanner;

public class Account {
    String name;
    int accNo;
    int phone;
    float balance;
    final static float MIN_BALANCE = 500.0f;

//    Account(String name,int accNo,float balance){
//        this.name = name;
//        this.accNo = accNo;
//        this.balance = balance;
//    }

    static Account getInput(){
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Enter name:");
        account.name = sc.next();
        System.out.println("enter acc no:");
        account.accNo = sc.nextInt();
        System.out.println("Enter phone number:");
        account.phone=sc.nextInt();
//        System.out.println("Enter minimum balance:");
        account.balance = MIN_BALANCE;
        return account;
    }

    void withDraw(float amount){
        if(amount > balance)
            System.out.println("Insufficient balace");
        else
            balance = balance - amount;
    }

    void deposit(float amount){
        balance = balance + amount;
    }

//    @Override
//    public String toString() {
//        return "Account{" +
//                "name='" + name + '\'' +
//                ", accNo=" + accNo +
//                ", phone=" + phone +
//                ", balance=" + balance +
//                '}';
//    }

   }
