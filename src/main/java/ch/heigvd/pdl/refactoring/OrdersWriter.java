package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class OrdersWriter {

    private List<Order> orders = new ArrayList<Order>();

    public OrdersWriter(List<Order> orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuilder sb = new StringBuilder("{\"orders\": [");

        for (int i = 0; i < orders.size(); i++) {
            sb.append(orders.get(i).toJsonString());
            sb.append(", ");
        }

        if (!orders.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}