public abstract class Phone implements Printable{
        private String model;
        private int storageCapacity;
        private double screenSize;
        private int batteryCapacity;


        public Phone( String model, int storageCapacity, double screenSize, int batteryCapacity) {
            this.model = model;
            this.storageCapacity = storageCapacity;
            this.screenSize = screenSize;
            this.batteryCapacity = batteryCapacity;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getStorageCapacity() {
            return storageCapacity;
        }

        public void setStorageCapacity(int storageCapacity) {
            this.storageCapacity = storageCapacity;
        }



        public double getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }

        public int getBatteryCapacity() {
            return batteryCapacity;
        }

        public void setBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
        }

    public void print() {

    }

    @Override
        public String toString() {
            return "Phone{" +
                    ", model='" + model + '\'' +
                    ", storageCapacity=" + storageCapacity +
                    ", screenSize=" + screenSize +
                    ", batteryCapacity=" + batteryCapacity +
                    '}';
        }
    }



