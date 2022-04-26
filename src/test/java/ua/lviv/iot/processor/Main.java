
        package ua.lviv.iot.processor;

        import ua.lviv.iot.manager.ShopManager;
        import ua.lviv.iot.model.Product;
        import ua.lviv.iot.model.ProductName;
        import ua.lviv.iot.model.ProductType;

public class Main {
    public static void main(String[] args) {
        ShopManager manager = new ShopManager("Ivan");

        Product product1 = new Product(ProductName.antifreeze, ProductType.productForEngine, 102, 5000, "formula" );
        Product product2 = new Product(ProductName.Cleaner, ProductType.productForGlass, 230, 150, "ochistnuk" );
        Product product3 = new Product(ProductName.Glass_washer, ProductType.productForGlass, 200, 300, "Germany" );
        Product product4 = new Product(ProductName.Polish, ProductType.productForLeather, 204, 250, "formula" );

        manager.addProductToTheList(product1);
        manager.addProductToTheList(product2);
        manager.addProductToTheList(product3);
        manager.addProductToTheList(product4);

        manager.printListOfProduct();
    }
}