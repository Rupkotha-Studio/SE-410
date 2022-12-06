package org.practice;




public class Banking {
    private int balance=500;

    public void deposit(int amount){
        this.balance=amount;
    }
    public void Withdrows(int amount){
        if (balance<500)
            System.out.println("Not Sufficient Fund");
        if (balance>500)
            balance-=amount;
    }

    public void getBalance() {
        System.out.println("Balance "+balance);
    }

    public static void main(String[] args) {
        var ob=new Banking();
        ob.deposit(1000);
        ob.getBalance();
        ob.Withdrows(500);
        ob.Withdrows(300);
        ob.getBalance();
    }
}
