public class Main {
    public static void main(String[] args) {

        createObject("2й");
        createObject("3й");
        createObject("4й");
    }

    public static String createObject(String className) {
        switch (className) {
            case "2й":
                Samsung samsung = new Samsung("Samsung", "Samsung Galaxy S8");
                samsung.print();
                break;
            case "3й":
                Iphone iphone = new Iphone("iPhone", "purple");
                iphone.print();
                break;
            case "4й":
                Xiaomi xiaomi = new Xiaomi("Xiaomi", "Android");
                xiaomi.print();
        }
     return className;
    }
}