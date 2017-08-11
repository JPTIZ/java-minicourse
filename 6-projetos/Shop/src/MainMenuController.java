import java.util.ArrayList;

public class MainMenuController {
	public void start() {
		int option = 0;
		while (option != 4) {
			option = view.showOptions();
			switch (option) {
			case 1:
				onSelectCreateProduct();
				break;
			case 2:
				startSale();
				break;
			case 3:
				view.listProducts(products);
				break;
			case 4:
				break;
			default:
				view.showWarning("Opção inválida");
			}
		}
	}
	
	private void onSelectCreateProduct() {
		String name = view.askProductName();
		int price = view.askProductPrice();
		
		if (name.isEmpty()) {
			view.showWarning("O nome não pode ser vazio.");
		}
		products.add(new Product(name, price));
	}
	
	private void startSale() {
		new SaleController(products).start();
	}
	
	private ArrayList<Product> products = new ArrayList<>();
	private MainMenuView view = new MainMenuView();
}
