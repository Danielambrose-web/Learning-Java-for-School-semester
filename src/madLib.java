import java.util.Scanner;

public class madLib {
    public static void main(String[] args) {

        String place = "";
        String noun = "";
        String  discription= "";
        String action = "";
        String mood = "";


        Scanner require = new Scanner(System.in);
        System.out.println("Enter an  adjective(description of a place): ");
        place =  require.nextLine();

                System.out.println("Enter an  noun(name/animal): ");
        noun =  require.nextLine();

                System.out.println("Enter an  adjective(description): ");
        discription =  require.nextLine();

                System.out.println("Enter an  adjective(description(action)): ");
        action =  require.nextLine();

                System.out.println("Enter an  adjective(description(mood)): ");
        mood =  require.nextLine();


        require.close();

        System.out.println("Today I went to a "+ place);
        System.out.println("In an exhibit, i saw "+ noun);
        System.out.println(noun +" was "+discription+ "and "+action);
        System.out.println("I was "+mood);

        // System.out.print(name);
    }
}
