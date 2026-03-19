import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner =  new Scanner(System.in);

        System.out.print("How many seconds to countdown form?: ");
        int start = scanner.nextInt();

        for(int i =start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!!!");
    }
}
