package vn.kho.model;

public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Phương thức trừu tượng tính lợi nhuận
    public abstract double calculateProfit();

    public String getId() { return id; }
    public String getName() { return name; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Format chuỗi để ghi vào CSV: Type,ID,Name,Price,Stock
    @Override
    public String toString() {
        return id + "," + name + "," + price + "," + stock;
    }
}