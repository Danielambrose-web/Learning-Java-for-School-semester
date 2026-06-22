import java.util.Scanner;

public class shoppingCart {
    //a shopping cart logic program

    public static void main(String[] args) {
        Scanner cartItem = new Scanner(System.in);

        String item = "";
        double price;
        int quantity;

        System.out.println("What will you like to get");
        item = cartItem.nextLine();

        System.out.println("How many"+" " +item + " do you need ");
        quantity = cartItem.nextInt();

        System.out.println("how much is a single" +" "+ item);
        price = cartItem.nextDouble();


        cartItem.close();

        double totalCost = price * quantity; 

        System.out.println("hi valuable customer!");
        System.out.println("you will be getting "+ item );
        System.out.println("at "+"#"+price +" each ");
        System.out.println("and you will be paying "+ "#"+totalCost );
        System.out.println("for "+ quantity +  " "+ item);
    }
}
