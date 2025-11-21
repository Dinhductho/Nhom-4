package vn.kho.model;

public class Electronics extends Product {
    public Electronics(String id, String name, double price, int stock) {
        super(id, name, price, stock);
    }

    @Override
    public double calculateProfit() {
        // Ví dụ: Lợi nhuận 20%
        return this.price * 0.2;
    }

    @Override
    public String toString() {
        return "Electronics," + super.toString();
    }
}