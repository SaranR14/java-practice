import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the no. of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the no. of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the Symbol to be printed: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i<rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
