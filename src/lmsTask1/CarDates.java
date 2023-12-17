package lmsTask1;

import java.math.BigDecimal;

public class CarDates {
    private int issueYear;
    private String model;
    private BigDecimal price;
    private String color;

    public CarDates() {
    }

    public CarDates(int issueYear, String model, BigDecimal price, String color) {
        this.issueYear = issueYear;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarDates{" +
                "issueYear=" + issueYear +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
