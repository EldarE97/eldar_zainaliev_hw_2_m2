public class Main {
    public static void main(String[] args) {
     /*  Samsung samsung = new Samsung("Samsung", "Samsung Galaxy S8");
       samsung.print();

       Iphone iphone = new Iphone("iPhone", "purple");
       iphone.print();

       Xiaomi xiaomi = new Xiaomi("Xiaomi", "Android");
       xiaomi.print(); */

       // Printable[] printables = {samsung};

        Main.createObject("2й");
        Main.createObject("3й");
        Main.createObject("4й");
    }

    public static Telephone createObject(String className) {
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
     return null;
    }
}
