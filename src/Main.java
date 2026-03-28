public class Main {

    public static void main(String[] args) {

        // Create at least 3 menu items (products)
        MenuItem coffee = new MenuItem("C1", "Coffee", 3.5, "Drink");
        MenuItem tea = new MenuItem("T1", "Tea", 2.5, "Drink");
        MenuItem cake = new MenuItem("D1", "Cake", 4.0, "Dessert");

        // Create a customer
        CafeCustomer customer = new CafeCustomer(1, "Ivan", "Ivanov", "ivan@mail.com");

        // Create an order for the customer
        Order order = new Order(customer);

        // Add items to the order using ArrayList
        order.addItem(coffee);
        order.addItem(tea);
        order.addItem(cake);

        // Print the order (this automatically calls toString())
        System.out.println(order);

        // Create another object with the same data to test equals()
        MenuItem anotherCoffee = new MenuItem("C1", "Coffee", 3.5, "Drink");

        // Compare two MenuItem objects using equals()
        System.out.println("\nComparing products:");
        System.out.println("coffee equals anotherCoffee: " + coffee.equals(anotherCoffee));

        // Create another customer with same email to test equals()
        CafeCustomer anotherCustomer = new CafeCustomer(2, "Ivan", "Ivanov", "ivan@mail.com");

        // Compare two customers using equals()
        System.out.println("customer equals anotherCustomer: " + customer.equals(anotherCustomer));
    }
}