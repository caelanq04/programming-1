//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VendingMachine vend1 = new VendingMachine(10, 5, 3.00, 2.00);
        VendingMachine vend2 = new VendingMachine();
        VendingMachine vend3 = new VendingMachine();

        System.out.println(vend1.stockWithMilk);
        System.out.println(vend1.stockWithoutMilk);
        System.out.println(vend1.priceWithMilk);
        System.out.println(vend1.priceWithoutMilk);
        System.out.println(vend1.balance);

        System.out.println("This machine (vend1) contains: " + vend1.stockWithMilk + " coffee with milk and " + vend1.stockWithoutMilk + " coffee without milk.");
        System.out.println("This machine (vend2) contains: " + vend2.stockWithMilk + " coffee with milk and " + vend2.stockWithoutMilk + " coffee without milk.");

        System.out.println(vend3.balance);

        vend3.balance = 5.0d;

        System.out.println(vend3.balance);

    }
}