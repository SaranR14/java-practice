import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         double weight;
         double newWeight;
         int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs ");
        System.out.println("2: Convert kgs to lbs ");

        System.out.print("Choose an option : ");
        choice=sc.nextInt();

        if(choice==1){
            System.out.print("Enter your weight in lbs : ");
            weight=sc.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("Your weight is %.2f in kgs",newWeight);
        }
        else if(choice==2){
            System.out.print("Enter your weight in kgs : ");
            weight=sc.nextDouble();
            newWeight=weight*2.20462;
            System.out.printf("Your weight is %.2f in lbs",newWeight);
        }
        else{
            System.out.println("Choose a valid option");
        }
        
        sc.close();
    }
}
