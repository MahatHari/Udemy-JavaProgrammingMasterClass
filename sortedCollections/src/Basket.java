import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> basket;

    public Basket(String name) {
        this.name = name;
        this.basket = new HashMap<>();
    }

    public  int addToBasket(StockItem item, int quantity){
        if((item!=null)&&quantity>0){
            int inBasket= basket.getOrDefault(item, 0);
            basket.put(item, inBasket+quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(basket);
    }

    @Override
    public String toString() {
        String s= "\nShopping Cart "+name+ " contains " +basket.size() + " items \n";
        double totalCost=0.0;
        for (Map.Entry<StockItem,Integer> item: basket.entrySet()){
            s=s+item.getKey() + ". "+ item.getValue() + " purchased \n";
            totalCost +=item.getKey().getPrice()* item.getValue();
        }
        return  s+ "Total Cost "+String.format("%.2f",totalCost);
    }
}
