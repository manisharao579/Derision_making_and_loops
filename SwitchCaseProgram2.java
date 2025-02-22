package ControlStatements;

public class SwitchCaseProgram2 {
    public static void main(String[] args) {
        String str = "monday";
        switch (str) {
            case "monday":
                System.out.println("day 1");
                break;
            case "tuesday":
                System.out.println("day 2");
                break;
            case "wednesday":
                System.out.println("day 3");
                break;
            case "thrusday":
                System.out.println("day 4");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
