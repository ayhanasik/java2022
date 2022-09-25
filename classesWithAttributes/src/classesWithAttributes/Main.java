package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("DELL");
		product.setId(1);
		product.setDescription("X550J Notebook");
		product.setPrice(25000);
		product.setStockamount(7);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
