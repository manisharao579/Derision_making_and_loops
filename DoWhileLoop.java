package ControlStatements;

public class DoWhileLoop
{
    public static void main(String[] args) {
        int number = 27;
        do {
            System.out.println(number);
            number = number/2;
        }while(number != 0);
    }
}
