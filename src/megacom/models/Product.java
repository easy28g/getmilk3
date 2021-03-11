package megacom.models;

import megacom.enums.Units;

public class Product {

    private int id;
    private String productName;
    private int amount;
    private Units units;
    private String discription;

    public Product(String productName, int amount, Units units, String discription) {
        this.id = (int) (Math.random() * (100000 - 1)) + 1;
        this.productName = productName;
        this.amount = amount;
        this.units = units;
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
