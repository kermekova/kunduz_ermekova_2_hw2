public class Xiaomi extends Phone {
    private String miuiVersion;

    public Xiaomi(String model, int storageCapacity, double screenSize, int batteryCapacity, String miuiVersion) {
        super(model, storageCapacity, screenSize, batteryCapacity);
        this.miuiVersion = miuiVersion;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    public String getMiuiVersion() {
        return miuiVersion;
    }

    public void setMiuiVersion(String miuiVersion) {
        this.miuiVersion = miuiVersion;
    }

    @Override
    public String toString() {
        return "Xiaomi{" +
                "miuiVersion='" + miuiVersion + '\'' +
                ", " + super.toString() +
                '}';
    }
}
