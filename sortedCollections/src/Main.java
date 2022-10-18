public class Main {
    private static  StockList stockList= new StockList();
    public static void main(String[] args) {


        StockItem temp= new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);
        temp= new StockItem("Cake", 1.86, 7);
        stockList.addStock(temp);

        temp= new StockItem("Milk", 12.50, 3);
        stockList.addStock(temp);
        temp= new StockItem("Car", 100.86, 2);
        stockList.addStock(temp);
        temp= new StockItem("Cup", .60, 200);
        stockList.addStock(temp);
        temp= new StockItem("Chairs", 100.60, 50);
        stockList.addStock(temp);
        temp= new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp= new StockItem("Flower", 29.60, 400);
        stockList.addStock(temp);
        temp= new StockItem("Juice", 2.60, 400);
        stockList.addStock(temp);

        temp= new StockItem("Towel", 19.60, 400);
        stockList.addStock(temp);

        for (String s: stockList.Items().keySet()){
            System.out.println(s);
        }
        System.out.println(stockList);

        System.out.println(stockList.get("Car"));

        Basket timsBasket = new Basket("Tims");
        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);
        sellItem(timsBasket, "Car", 1);
        System.out.println(stockList);

        sellItem(timsBasket, "Cup", 1);
        System.out.println(stockList);
        sellItem(timsBasket, "Towel", 10);
        System.out.println(stockList);

        stockList.Items().get("Car").adjustStock(200);
        System.out.println(stockList);

        System.out.println(timsBasket);

    }

    public static int sellItem(Basket shoppingCart, String item, int quantity){
        // retrieve the item from stock list;

        StockItem stockItem= stockList.get(item);
        if(stockItem==null){
            System.out.println("We dont sell "+item);
            return 0;
        }
        if(stockList.sellStock(item, quantity)!=0){
            shoppingCart.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
