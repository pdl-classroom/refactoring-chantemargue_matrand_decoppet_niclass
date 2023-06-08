package ch.heigvd.pdl.refactoring;

public class Product {

    private String code;
    private int color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, int color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String toJsonString() {
        StringBuffer sb = new StringBuffer("");

        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(this.getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(this.getColorString());
        sb.append("\", ");

        if (this.getSize() != Size.Invalid_size) {
            sb.append("\"size\": \"");
            sb.append(this.getSize());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(this.getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(this.getCurrency());
        sb.append("\"}");

        return sb.toString();
    }

    public String getColorString() {
        switch (this.getColor()) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "yellow";
            default:
                return "no color";
        }
    }
}