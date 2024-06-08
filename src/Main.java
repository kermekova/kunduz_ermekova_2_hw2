public class Main {

    public static Phone createObject(String className) {
        try {
            switch (className) {
                case "iPhone":
                    return new iPhone ("iPhone 13", 128, 16.5, 99, "iOS 18");
                case "Samsung":
                    return new Samsung ("Samsung 21S", 64, 13, 100, "Android 13");
                case "Xiaomi":
                    return new Xiaomi ("Mi 10", 128, 14, 79, "MIUI 12.5");
                default:
                    throw new IllegalArgumentException("Unknown class name: " + className);
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the object: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Phone iphone = createObject("iPhone");
            Phone samsung = createObject("Samsung");
            Phone xiaomi = createObject("Xiaomi");


            if (iphone == null || samsung == null || xiaomi == null) {
                throw new Exception("One of the phone objects is null.");
            }


            Printable[] phones = { (Printable) iphone, (Printable) samsung, (Printable) xiaomi };


            for (Printable phone : phones) {
                phone.print();
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
