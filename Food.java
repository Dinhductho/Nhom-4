package vn.kho.model;

public class Food extends Product {
    public Food(String id, String name, double price, int stock) {
        super(id, name, price, stock);
    }

    @Override
    public double calculateProfit() {
        // Ví dụ: Lợi nhuận 10%
        return this.price * 0.1;
    }

    @Override
    public String toString() {
        return "Food," + super.toString();
    }
}