package org.launchcode;

public class MenuItemOne {
    private String itemName;
    private String itemDescription;

    private String category;
    private double price;
    private boolean isNew;

    public MenuItemOne(String itemName, String itemDescription, String category, double price, boolean isNew) {
        this.itemName=itemName;
        this.itemDescription=itemDescription;
        this.itemDescription=category;
        this.price=price;
        this.isNew=isNew;
    }

    public String getItemName() {
        return itemName;
    }

    protected void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    protected void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getCategory() {
        return category;
    }

    protected void setCategory(String itemDescription) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsNew() {
        return isNew;
    }

    protected void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
