import java.util.ArrayList;

public class FoodPanda {

    
    public static void main(String[] args) {

        // Restaurants
        Restaurant r1 = new Restaurant("Butt Karahi", "Lahore", 4.9);
        Restaurant r2 = new Restaurant("Kolachi", "Karachi", 4.5);
        Restaurant r3 = new Restaurant("Monal", "Islamabad", 4.2);

        // Composition: restaurant creates menu
        r1.addMenuItem(new MenuItem("Chicken Karahi", 1000, "High"));
        r1.addMenuItem(new MenuItem("Biryani", 500, "Medium"));
        r1.addMenuItem(new MenuItem("Burger", 300, "Low"));

        r2.addMenuItem(new MenuItem("BBQ Platter", 1500, "High"));
        r2.addMenuItem(new MenuItem("Biryani    ", 600, "Medium"));

        r3.addMenuItem(new MenuItem("Pizza ", 1200, "High"));
        r3.addMenuItem(new MenuItem("Burger", 350, " Low"));

        // Aggregation
        Restaurant[] res = {r1, r2, r3};

        DeliverySystem system = new DeliverySystem(res);

        // Create order
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("Chicken Karahi", 1000, "High"));
        items.add(new MenuItem("Burger        ", 300, "  Low"));

        Order o1 = new Order("Farhan", items);

        // Copy order
        Order o2 = new Order(o1);
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║=======================Menu=======================║");
        System.out.println("╚══════════════════════════════════════════════════╝ ");  
        system.displayMenus();
        
        // Place orders
        system.placeOrder(o1);
        system.placeOrder(o2);

        // Show orders
        system.showOrders();

        // equals test
        System.out.println("o1 equals o2: " + o1.equals(o2));

        // find restaurant
        System.out.println(system.findRestaurant("Lahore"));
       
       
    }
}