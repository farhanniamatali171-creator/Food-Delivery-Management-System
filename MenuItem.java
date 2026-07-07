    
    public class MenuItem {

        private String name;
        private double price;
        private String category;

        // Constructor
        public MenuItem(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        // Copy Constructor
        public MenuItem(MenuItem m) {
            this.name = m.name;
            this.price = m.price;
            this.category = m.category;
        }
        //Getter Method
        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }
        //To String
        @Override
        public String toString() {
            return "-"+name + " (" + category + ")"+ " - Rs." + price ;
        }
        //Equals Method
        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (!(obj instanceof MenuItem))
                return false;

            MenuItem m = (MenuItem) obj;

            return name.equals(m.name) && price == m.price;
        }
    }