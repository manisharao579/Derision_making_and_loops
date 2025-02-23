package ControlStatements;

import java.util.Scanner;

public class calculator_using_do_while_loop {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;
        String respone = "";
        do{
            System.out.println("Enter the 1st number: ");
            int n1 = sc.nextInt() ;
            System.out.println("Enter the 2nd number: ");
            int n2 = sc.nextInt() ;
            System.out.println("Enter the Symbol +, -, *, / ");
            String symbol = sc.next();
            switch (symbol){
                case "+" :
                    System.out.println(n1+n2);
                    break ;
                case "-" :
                    System.out.println(n1-n2);
                    break;
                case "*" :
                    System.out.println(n1*n2);
                    break ;
                case "/" :
                    System.out.println(n1/n2);
                    break;
                default:
                    System.out.println("Wrong input");
            }
            System.out.println("Do you want to continue, Press y for yes and n for No");
            respone = sc.next() ;
        }
        while(respone.equals("y") || respone.equals("Y")) ;
    }
}
