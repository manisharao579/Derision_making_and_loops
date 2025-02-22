package ControlStatements;

public class GreaterNumberBetweenThreeNumbers
{
    public static void main(String [] args) {
        int n1 = 10 ;
        int n2 = 20 ;
        int n3 = 30 ;
        if(n1>n2 && n1>n3){
            System.out.println("n1 is Greater");
        }
        else if(n2>n1 && n2>n3){
            System.out.println("n2 is greater");
        }
        else {
            System.out.println("n3 is greater");
        }
    }
}
