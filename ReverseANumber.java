package ControlStatements;

public class ReverseANumber
{
    public static void main(String [] args) {
        int n = 12345 ;
        int ans = 0 ;
        while(n>0){
            ans = ans*10 + n%10 ;
            n = n/10 ;
        }
        System.out.println(ans);
    }
}
