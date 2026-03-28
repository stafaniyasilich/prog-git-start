import java.util.ArrayList;

public class Order {

    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;

    private static int nextOrderNumber = 1;

    public Order(CafeCustomer customer) {
        this.orderNumber = nextOrderNumber++;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.paid = false;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public int countItems() {
        return items.size();
    }

    public void markAsPaid() {
        this.paid = true;
    }

    public static int getNextOrderNumber() {
        return nextOrderNumber;
    }

    @Override
    public String toString() {
        String result = "Order #" + orderNumber + "\n";
        result += "Customer: " + customer + "\n";
        result += "Items:\n";

        for (MenuItem item : items) {
            result += "- " + item + "\n";
        }

        result += "Total: $" + calculateTotal() + "\n";
        result += "Paid: " + (paid ? "Yes" : "No");

        return result;
    }
}
