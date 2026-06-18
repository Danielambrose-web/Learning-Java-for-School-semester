import java.util.Scanner;

public class Day2{
    public static void main(String[] args) {
        // int num1 = 3;
        // int num2 = 4;

        // int cal = num1 + num2;
        // System.out.println(cal);
        Scanner scanner = new Scanner(System.in);

        System.out.println("what your name");
        String voterName = scanner.nextLine();

        System.out.println("how old are you");
        int voterAge = scanner.nextInt();

        System.out.println("where are you from");
        String voterOrigin = scanner.nextLine();
        scanner.nextLine();

        System.out.println("are you a working class(Yes or No)");
        String occupation = scanner.nextLine();

        if(voterAge >17 && occupation.equals("Yes")){
            System.out.println("Hi " + voterName);
            System.out.println("You are from " + voterOrigin);
            System.out.println("Congratualations  You are eligible to vote TINUBU" );

        }else{
            System.out.println("you are still a Child");
        }
 
        scanner.close();
    }
}