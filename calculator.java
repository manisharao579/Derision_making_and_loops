package ControlStatements;

public class calculator
{
    public static void main(String [] args) {
        int n1 = 10 ;
        int n2 = 20 ;
        char c = '*' ;
        switch (c){
            case '+' :
                System.out.println(n1+n2);
                break ;
            case '-' :
                System.out.println(n1-n2);
                break;
            case '*' :
                System.out.println(n1*n2);
                break ;
            case '/' :
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
