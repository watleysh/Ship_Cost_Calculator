import java.util.Scanner;

public class ShipCost {
    void main() {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shipCosts = 0;
        double totalCosts = 0;

        final double SHIP_COST_THRESHOLD = 100;
        final double SHIP_RATE = 0.02;
        String trash = "";

        //get itemPrice
        IO.println("Enter the item price");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the newline from buffer

            if (itemPrice >= SHIP_COST_THRESHOLD) {
                shipCosts = 0;
                totalCosts = itemPrice;

            } else //calculate shipping cost
            {
                shipCosts = itemPrice * SHIP_RATE;
                totalCosts = itemPrice + shipCosts;

            }
            IO.println("The shipping cost is " + shipCosts);
            IO.println("The total cost is " + totalCosts);
        } else //got trash
        {
            trash = in.nextLine();
            IO.println("This is an illegal value " + trash);
            IO.println("Run the program again with correct input ");
            System.exit(0);


        }
        in.close();

















    }
}
