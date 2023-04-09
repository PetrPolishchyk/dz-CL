public class Main {

    public static void main(String[] args) {

        //Task 1 - Conditions. Readme file #1.
        Conditions conditions = new Conditions();
        System.out.println("Please enter the year:");
        int year = conditions.getValue();
        // the result of the task #1
        conditions.isYearALeap(year);

        //Task 2 - Conditions. Readme file #2.
        System.out.println("Please enter the appropriate number: 1 = red, 2 = yellow, 3 = green.");
        int colourNumber = conditions.getValue();
        String colour = conditions.getColor(colourNumber);
        //get the action as a result of the task #2
        conditions.theAction(colour);

        //Task 3 - Loops. Readme file #3.
        Loops loops = new Loops();
        System.out.println("Please enter the number:");
        int n = loops.getNumberValue();
        // the result of #3 task
        loops.showTheResult(n);

        //Task 4 - Loops. Readme file #4.
        System.out.println("Please enter the number to calculate factorial:");
        int factorial = loops.getNumberValue();
        System.out.println(loops.factorialResult(factorial));
    }
}
