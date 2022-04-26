package ua.lviv.iot.manager;

import ua.lviv.iot.model.Product;
import ua.lviv.iot.model.ProductType;
import ua.lviv.iot.processor.impl.iShopManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopManager implements iShopManager {
    public String nameOFManager;

    public ShopManager(String nameOFManager) {
        this.nameOFManager = nameOFManager;
    }

    private final List<Product> productList = new ArrayList<>();


    @Override
    public void addProductToTheList(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteProductFromTheList(Product product) {
        productList.remove(product);
    }

    @Override
    public void sortListBYPrice() {
        productList.sort(Comparator.comparingInt(Product::getPrice));
    }

    @Override
    public void sortListByVolume() {
        productList.sort(Comparator.comparingInt(Product::getVolume));
    }

    @Override
    public void printListOfProduct() {
        System.out.println(productList);

    }

    @Override
    public void findProductByProductType(ProductType productType) {
        List<Product> filteredList = productList.stream()
                .filter(product -> product.getProductType() == productType).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}