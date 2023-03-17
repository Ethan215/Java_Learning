
public class CashRegister{
    // Number of items and amount for one cash register
    private int itemCount;
    private double cashRegisterTotal;
    private double itemDiscount;
    // Number of items and amount for all cash register
    private static double allCashRegisterTotals;
    private static  int allItemCount;


    /**
     * Constructor function ;
     */
    public  CashRegister(){
        this(0,0);  // call another Constructor function;
        allCashRegisterTotals = 0;
        allItemCount = 0;
        itemDiscount = 0;

    }

    /**
     * Construction with itemCount
     * @param itemCount
     */
    public  CashRegister(int itemCount){
        this.itemCount = itemCount;
        allItemCount += itemCount;
        itemDiscount = 0;

    }

    /**
     *Construction when itemCount and cashRegisterTotal are known；
     * @param itemCount
     * @param cashRegisterTotal
     */
    public CashRegister(int itemCount, double cashRegisterTotal){
        this.itemCount = itemCount;
        this.cashRegisterTotal = cashRegisterTotal;
        allItemCount += itemCount;
        allCashRegisterTotals += cashRegisterTotal;
        itemDiscount = 0;

    }


    /**
     *Add an item to your cash register.
     * @param price
     */
    public void addItem(double price){
        itemCount++;
        cashRegisterTotal += price;
        allItemCount++;
        allCashRegisterTotals += price;

    }

    /**
     * Add an item to your Cash Register after the item have discount.
     * @param originPrice
     * @param discount
     */
    public void addDiscountItem( double originPrice,double discount){
        itemCount++;
        itemDiscount = discount;
        cashRegisterTotal += (originPrice*(1-discount));
        allItemCount++;
        allCashRegisterTotals += (originPrice*(1-discount));

    }
    /**
     *Remove an item from your cash register.
     * @param price
     */
    public void removeItem(double price){
        itemCount--;
        cashRegisterTotal -= price;
        allItemCount--;
        allCashRegisterTotals -= price;
    }

    /**
     * Get the value of cashRegisterTotal
     * @return cashRegisterTotal
     */
    public double getCashRegisterTotal(){
        return cashRegisterTotal;
    }

    /**
     * Get the number of Ite,
     * @return itemCount
     */
    public int getCount(){
        return itemCount;
    }


    /**
     * Get the Value of allCashRegisterTotals
     * @return allCashRegisterTotals
     */
    public static double getAllCashRegisterTotals(){
        return allCashRegisterTotals;
    }

    /**
     *  Get the Value of allItemCount
     * @return allItemCount
     */
    public static int getAllItemCount(){
        return allItemCount;
    }
    /**
     * Deduct itemCount from allItemCount
     * Deduct cashRegisterTotal from allCashRegisterTotal
     *  Clear itemCount and cashRegisterTotal
     */
    public void clear(){
        allItemCount -= itemCount;
        allCashRegisterTotals -= cashRegisterTotal;
        itemCount = 0;
        cashRegisterTotal = 0;
    }

}



