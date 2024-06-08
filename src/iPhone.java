public class iPhone extends Phone {
    private String iOSVersion;

    public iPhone(String model, int storageCapacity, double screenSize, int batteryCapacity, String iOSVersion) {
        super(model, storageCapacity, screenSize, batteryCapacity);
        this.iOSVersion = iOSVersion;
    }

    public String getiOSVersion() {
        return iOSVersion;
    }

    public void setiOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "iOSVersion='" + iOSVersion + '\'' +
                ", " + super.toString() +
                '}';
    }
}
