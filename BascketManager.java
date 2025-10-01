import java.util.ArrayList;
import java.util.List;

public class BascketManager {

    private static BascketManager instance = null;

    private List<Product> basket;

    private BascketManager() {
        basket = new ArrayList<>();
    }

    public static BascketManager getInstance() {
        if (instance == null) {
            instance = new BascketManager();
        }
        return instance;
    }

    public void addproduct(Product product) {
        basket.add(product);
    }

    public List<Product> getBasket() {
        return basket;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Product p : basket) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void removeProduct(Product product) {
        basket.remove(product);
    }

    public void clearBasket() {
        basket.clear();
    }
}
