package ControlStatements;

public class LabbeledBreak {
    public static void main(String [] args) {
        outer:
        for(int i=1 ; i<=5 ; i++){
            System.out.println("i: " + i);
            inner: //optional
            for(int j=1 ; j<=5 ; j++){
                if(i==3){
                    break outer; //if inner is written, then it will break from inner loop only
                }
                System.out.println(": " + j);
            }
        }
     }
}
