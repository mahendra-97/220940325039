package JavaTest;
import java.util.Scanner;
class BankAccount{
    int accno;
    double balance;
    int amount = 0;

    public BankAccount(int accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }
    void show(){
        System.out.println("Account number : "+accno+"\nBalance : "+balance);
    }
    void withdraw(int w){
        try{
            if(balance<amount){
                throw new ArithmeticException("Not enough Balance");
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        if (balance>amount){
            balance = balance - amount;
        }
        System.out.println("Current balance is : "+balance);
    }
    void deposit(int d){
        this.amount = d;
        balance = balance + amount;
        System.out.println("Current balance is "+balance);
    }
}
public class q2 {
    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);
        System.out.println("Enter the account number : ");
        int acc = sp.nextInt();
        System.out.println("Enter the amount : \n");
        int amt = sp.nextInt();

        BankAccount b = new BankAccount(acc,amt);
        vnp:while(true){
            System.out.println("0.Exit \n1. Withdraw \n2.Deposit \n3.Show Account details");
            int ch = sp.nextInt();
            switch (ch){
                case 0:
                    break vnp;
                case 1:
                    System.out.println("Enter the amount to Withdraw");
                    int wtd  = sp.nextInt();
                    b.withdraw(wtd);
                    break;
                case 2:
                    System.out.println("Enter the amount to Deposit");
                    int dep = sp.nextInt();
                    b.deposit(dep);
                    break;
                case 3:
                    System.out.println("Acoount details :");
                    b.show();
                    break;
            }
        }
    }
}
