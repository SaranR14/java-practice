import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hour;
        System.out.print("Enter the hour : ");
        hour = sc.nextInt();

        String result = (hour<12) ? "AM" : "PM";
        System.out.printf("It is %s. ", result);

        sc.close();
    }
}