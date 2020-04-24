public class Main
{
    public static void main(String[] args)
    {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 999.99;
        product.name = "Laptop";
        productManager.add(product);

        ProductValidator productValidator = new ProductValidator();
        productValidator.test();
    }
}
