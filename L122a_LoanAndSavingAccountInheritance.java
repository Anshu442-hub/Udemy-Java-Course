package com.company;
class Account122a {
    public String accNo;
    public String name;
    public String address;
    public String phno;
    public String dob;
    public long balance;

    public Account122a() {
    }

    public Account122a(String accNo, String name, String address, String phno, String dob) {
        this. accNo=accNo;
        this. name=name;
        this. address=address;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }

    public String getAccNo() {
        return accNo;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhno() {
        return phno;
    }
    public String getDob() {
        return dob;
    }
    public long getBalance() {
        return balance;
    }

    public void setAddress(String address) {
        this.address=address;
    }
    public void setPhno(String phno) {
        this.phno=phno;
    }

}
class SavingsAccount122a extends Account122a {
    public void deposit(long amt) {
        balance+=amt;
    }
    public void withdraw(long amt) {
        balance-=amt;
    }
}

class LoanAccount122a extends Account122a {
    public void payEMI(long amt) {
        balance-=amt;
    }
    public void repay(long amt) {
            balance= balance==amt ? balance : 0;
    }
}
public class L122a_LoanAndSavingAccountInheritance {
    public static void main(String[] args) {

    }

}
