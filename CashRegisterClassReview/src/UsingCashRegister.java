
public class UsingCashRegister {
    public static void main(String[] args){
        CashRegister Register1 = new CashRegister();
        CashRegister Register2 = new CashRegister(5,50.55);
        CashRegister Register3 = new CashRegister(10,100.90);
        CashRegister Register4 = new CashRegister(1);


        System.out.println("We have a total of four cash registers here. ");
        System.out.println("Cash register#1 has processed " + Register1.getCount() +
                " item today and currently has $" + Register1.getCashRegisterTotal());
        System.out.println("Cash register#2 get  " + Register2.getCount() +
                " items today and currently has $" + Register2.getCashRegisterTotal());
        System.out.println("Cash register#3 has processed " + Register3.getCount() +
                " items today and currently has $" + Register3.getCashRegisterTotal());
        System.out.println("Cash register#4 has processed " + Register4.getCount() +
                " items today and currently has $" + Register4.getCashRegisterTotal());

        System.out.println("All my cash registers have processed a total of " + CashRegister.getAllItemCount()+
                " so far and currently have $" + CashRegister.getAllCashRegisterTotals());

        Register1.addItem(27.32);
        System.out.println("A customer bought an item that costs $27.32 at the Cash Register#1. " +
                "Cash register #1 has processed " + Register1.getCount() +
                " item(s) and currently has $" + Register1.getCashRegisterTotal());

        Register2.removeItem(43.25);
        System.out.println(" A customer requested a refund of an item that costs $43.25 at the Cash Register#2. " +
                "Cash register #2 has processed " + Register2.getCount() +
                " item(s) and currently has $" + String.format("%.2f",Register2.getCashRegisterTotal()));

        Register3.addDiscountItem(100.50, 0.2);
        System.out.println("A customer purchases an item at a 20% discount (original price $100.50) at Cash Register#3. " +
                "Cash register #3 has processed " + Register3.getCount() +
                " item(s) and currently has $" + Register3.getCashRegisterTotal());
        
        Register4.addItem(33.33);
        Register4.addItem(22.22);
        System.out.println("A customer bought two items that costs $30.33 and $20.22 each at the Cash Register#4. " +
                "Cash register #4 has processed " + Register4.getCount() +
                " item(s) and currently has $" + Register4.getCashRegisterTotal());


        System.out.println("Within the last 30 minutes, all your cash registers have processed " + CashRegister.getAllItemCount() +
                " item(s) and currently has $" + String.format("%.2f",CashRegister.getAllCashRegisterTotals()));
    }
}
