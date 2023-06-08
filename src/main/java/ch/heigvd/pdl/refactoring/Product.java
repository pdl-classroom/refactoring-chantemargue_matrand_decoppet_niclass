package ch.heigvd.pdl.refactoring;

public class Product {

    public static final int SIZE_NOT_APPLICABLE = -1;

    private String code;
    private int color;
    private int size;
    private double price;
    private String currency;

    public Product(String code, int color, int size, double price, String currency) {
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

    public int getSize() {
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

        if (this.getSize() != Product.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(this.getSizeString());
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

    public String getSizeString() {
        switch (this.getSize()) {
            case 1:
                return "XS";
            case 2:
                return "S";
            case 3:
                return "M";
            case 4:
                return "L";
            case 5:
                return "XL";
            case 6:
                return "XXL";
            default:
                return "Invalid Size";
        }
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