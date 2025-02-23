package ControlStatements;

public class UnrechableStatement
{
    public static void main(String [] args) {
        for(int i=1; true ; i++){
            System.out.println("i: " + i);
        }
         /*System.out.println("hi");  //unreachable statement*/
    }
}
