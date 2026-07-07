import java.util.ArrayList;
public class DeliverySystem {

        // Aggregation
        Restaurant[] restaurants;

        ArrayList<Order> orders = new ArrayList<>();

        public DeliverySystem(Restaurant[] restaurants) {
            this.restaurants = restaurants;
        }

        // find restaurant by city
        public Restaurant findRestaurant(String city) {

            for (Restaurant r : restaurants) {

                if (r.getCity().equals(city)) {
                    return r;
                }
            }

            return null;
        }

        // place order
        public void placeOrder(Order o) {
            orders.add(o);
        }

        // show orders
        public void showOrders() {

            for (Order o : orders) {
                System.out.println(o);
            }
        }
        //Display Menu
         public void displayMenus() {
        for (Restaurant r : restaurants) {
            System.out.println(r);
            for (MenuItem m : r.getMenu()) {
                System.out.println("  " + m);
            }
        }
    }
    }