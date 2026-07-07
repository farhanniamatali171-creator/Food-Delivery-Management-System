import java.util.ArrayList;
public class Order {

        private int orderId;
        private static int nextId = 1;

        private String customerName;
        private ArrayList<MenuItem> items = new ArrayList<>();
       //Constructor
        public Order(String customerName, ArrayList<MenuItem> items) {

            this.customerName = customerName;
            this.orderId = nextId++;

            // deep copy
            for (MenuItem m : items) {
                this.items.add(new MenuItem(m));
            }
        }

        // Copy Constructor (deep copy)
        public Order(Order o) {

            this.customerName = o.customerName;
            this.orderId = nextId++;

            for (MenuItem m : o.items) {
                this.items.add(new MenuItem(m));
            }
        }
        //Get Total Price
        public double getTotalPrice() {

            double total = 0;

            for (MenuItem m : items) {
                total += m.getPrice();
            }

            return total;
        }
        //To String
        @Override
        public String toString() {
            System.out.println("┌────────────────────────────┐");
            System.out.println("│======Order Information=====│");
            System.out.println("└────────────────────────────┘");
            return "OrderID    : " + orderId +
                 "\nCustomer   : " + customerName +
                 "\nTotal (Rs) : " + getTotalPrice();
        }
        //Equals Method
        @Override
        public boolean equals(Object obj) {

            if (!(obj instanceof Order))
                return false;

            Order o = (Order) obj;

            return customerName.equals(o.customerName)
                    && items.equals(o.items);
        }
    }
