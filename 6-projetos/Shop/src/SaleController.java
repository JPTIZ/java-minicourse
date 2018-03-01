import java.util.ArrayList;
import java.util.HashMap;

public class SaleController {
    public SaleController(ArrayList<Product> products) {
        this.products = products;
    }

    public void start() {
        var option = 0;
        while (option != 3 && option != 4) {
            option = view.showOptions();
            switch (option) {
            case 1:
                {
                    view.listProducts(products);
                    var productId = view.askProduct();

                    if (productId < 0 || productId >= products.size()) {
                        view.showWarning("Código inválido");
                    } else {
                        var amount = view.askAmount();
                        items.put(products.get(productId), amount);
                    }
                }
                break;
            case 2:
                {
                    view.listProducts(products);
                    var productId = view.askProduct();


                    if (productId < 0 || productId >= products.size()) {
                        view.showWarning("Código inválido");
                    } else {
                        items.remove(products.get(productId));
                    }
                }
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                view.showWarning("Opção inválida!");
            }
        }
    }

    private HashMap<Product, Integer> items = new HashMap<>();
    private var view = new SaleView();
    private ArrayList<Product> products;
}
