import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first number: ");
            double n1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the second number: ");
            double n2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("A = Addition");
            System.out.println("B = Subtraction");
            System.out.println("C = Multiplication");
            System.out.println("D = Division");

            System.out.println("Input your choice: ");
            String choice = scanner.nextLine();

            switch (choice.toUpperCase()) {
                case "A":
                    System.out.printf("%f + %f = %f \n", n1, n2, n1 + n2);
                    break;
                case "B":
                    System.out.printf("%f - %f = %f \n", n1, n2, n1 - n2);
                    break;
                case "C":
                    System.out.printf("%f * %f = %f \n", n1, n2, n1 * n2);
                    break;
                case "D":
                    if (n2 == 0){
                        System.out.println("Can not divided by zero.");
                    } else{
                    System.out.printf("%f / %f = %f \n", n1, n2, n1 / n2);
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("Continue? ");
            choice = scanner.nextLine();
            if (choice.equals("no")){
                System.exit(0);
            }



        }


    }
}