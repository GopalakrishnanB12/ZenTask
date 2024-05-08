import java.util.*;
public class Account {
    double balance;
    Account(){

    }
    Account(double balance){
        this.balance =balance;
    }
    double depositAmount(double amt){
        balance=balance+amt;
        return balance;
    }
    double withdrawAmount(double amt){
        balance=balance-amt;
        return amt;
    }
    public double displayBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Account acc1=new Account();
        
        System.out.println("Amount deposited in account: "+acc1.depositAmount(100));
        System.out.println("Amount withdraw from the account:"+acc1.withdrawAmount(5));
        System.out.println("Current Balance:"+acc1.displayBalance());
    }
    
}
