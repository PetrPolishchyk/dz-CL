import java.util.Scanner;

public class Conditions {
    //enter the year
    public int getValue(){
        Scanner number = new Scanner(System.in);
        int integerNumber = number.nextInt();
        return integerNumber;
    }

    public void isYearALeap (int a){
        if ((a % 4 == 0 && a % 100 != 0) || (a % 4 == 0 && a % 100 == 0 && a % 400 == 0)){
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }

    public String getColor(int number){
        String chosenColor = "empty";
        switch (number){
            case 1:
                chosenColor = "red";
                break;
            case 2:
                chosenColor = "yellow";
                break;
            case 3:
                chosenColor = "green";
                break;
            default:
                System.out.println("You entered the value out of the given condition!");
        }
        return chosenColor;
    }

    public void theAction(String color){
        if (color == "red"){
            System.out.println("Stop");
        } else if (color == "yellow") {
            System.out.println("Caution");
        } else if (color == "green"){
            System.out.println("Go");
        } else {
            System.out.println("Please, try again with given condition.");
            theAction(getColor(getValue()));
        }
    }
}
