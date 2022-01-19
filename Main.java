package com.company;
import java.util.Scanner;
class  ATM {
    private double bal = 50000;
    private int pwd;

    public void Deposit() {
        double money;
        System.out.println(" Please Enter Password......");
        Scanner avi = new Scanner(System.in);


        pwd = avi.nextInt();



        if (pwd == 8264) {
            System.out.println("Please Enter Amount");
            money =avi.nextDouble();
            bal = bal + money;
            System.out.println("Deposited money:" + money);
            System.out.println("Total Balance:" + bal);

        }
        else {
            System.out.println("Invalid Password........");
        }
    }
    public void Withdrawn() {
        double money;
        System.out.println(" Please Enter Password......");
        Scanner avi = new Scanner(System.in);
        pwd = avi.nextInt();

        if (pwd == 8264) {
            System.out.println("Please Enter Amount....");
            money= avi.nextDouble();
            bal = bal - money;
            System.out.println("Withdrawn Money:" + money);
            System.out.println("Total Balance:" + bal);
        } else {
            System.out.println("Invalid Password........");
        }
    }
    public void CheckBalance() {
        System.out.println(" Please Enter Password......");
        Scanner avi = new Scanner(System.in);
        pwd = avi.nextInt();
        if (pwd == 8264) {
            System.out.println("Total Balance:" + bal);
        } else {
            System.out.println("Invalid Password........");
        }
    }
  static  class customer{
        public static void main(String[] args) {
            ATM avi=new ATM();
            int ch;
            System.out.println("1.Deposit:");
            System.out.println("2.withdrawn:");
            System.out.println("3.CheckBalance:");
            System.out.println(" Please Enter Your Choice.....");
            Scanner avi2 = new Scanner(System.in);
            ch=avi2.nextInt();
            switch(ch){
                case 1: avi.Deposit();
                break;
                case 2: avi.Withdrawn();
                    break;
                case 3: avi.CheckBalance();
                    break;
                default:
                    System.out.println("Invalid Choice..........");
            }
        }
    }
}

