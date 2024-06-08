public class Samsung extends Phone{
    private String androidVersion;

    public Samsung(String model, int storageCapacity, double screenSize, int batteryCapacity, String androidVersion) {
        super(model, storageCapacity, screenSize, batteryCapacity);
        this.androidVersion = androidVersion;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "androidVersion='" + androidVersion + '\'' +
                ", " + super.toString() +
                '}';
    }
}

