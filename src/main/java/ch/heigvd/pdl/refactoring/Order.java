package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String toJsonString() {
        StringBuilder sb = new StringBuilder("");

        sb.append("{");
        sb.append("\"id\": ");
        sb.append(this.getOrderId());
        sb.append(", ");
        sb.append("\"products\": [");

        for (Product product : products) {
            sb.append(product.toJsonString());
            sb.append(", ");
        }

        if (this.getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]}");

        return sb.toString();
    }
}
