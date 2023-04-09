import java.util.Scanner;

public class Loops {
    public int getNumberValue() {
        Scanner number = new Scanner(System.in);
        int integerNumber = number.nextInt();
        return integerNumber;
    }

    public void showTheResult (int a){
        for (int i = a; i > 0; i--){
            System.out.print(i + " ");
            for (int j = i; j > 0; j--){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public int factorialResult (int a){
        int result = a * (a-1);
        for (int i = a-2; i > 1; i--){
            result = result * i;
        }
        return result;
    }
}
