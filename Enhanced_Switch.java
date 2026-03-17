import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String day;

        System.out.print("Enter a day of the week : ");
        day=sc.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday 😒");
            case "Saturday", "Sunday" -> System.out.println("It's the weekend 😁");
            default -> System.out.println(day + " is not a day!");
        }
    }
}
