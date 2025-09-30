public class VendingMachine {
    int stockWithMilk;
    int stockWithoutMilk;
    double priceWithMilk;
    double priceWithoutMilk;
    double balance;

    public VendingMachine(){
        this.stockWithMilk = 0;
        this.stockWithoutMilk = 0;
        this.priceWithMilk = 0.0d;
        this.priceWithoutMilk = 0.0d;
        this.balance = 0.0d;
    }

    public VendingMachine(int stockWithMilk, int stockWithoutMilk, double priceWithMilk, double priceWithoutMilk){
        this.stockWithMilk = stockWithMilk;
        this.stockWithoutMilk = stockWithoutMilk;
        this.priceWithMilk = priceWithMilk;
        this.priceWithoutMilk = priceWithoutMilk;
        this.balance = 0.0d;
    }
}
