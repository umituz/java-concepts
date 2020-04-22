public class ProductValidator
{
    static
    {
        System.out.println("constructor for static methods 1");
    }
    static
    {
        System.out.println("constructor for static methods 2");
    }

    public ProductValidator()
    {
        System.out.println("constructor for new ProductValidator()");
    }

    public static boolean isValid(Product product)
    {
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void test(){ }
}
