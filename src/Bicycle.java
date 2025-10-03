
// Класс велосипеда
public class Bicycle extends Transportprops {

    // Количество передач
    private int gears;

    public Bicycle(String name, int maxSpeed, int capacity, int gears) {
        super(name, maxSpeed, capacity);
        this.gears = gears;
    }
    @Override
    public void move() {
        System.out.println("\n Велосипед " + name + " едет по лесной дороге");
    }
    @Override
    public void stop() {
        System.out.println("\n Велосипед " + name + " Остановился");
    }
    @Override
    public void displayInfo() {
        System.out.println("\n Информация о велосипеде: " + name);
        System.out.println("Макс. скорость: " + maxSpeed + " км/ч");
        System.out.println("Количество передач: " + gears);
        System.out.println("Вместимость: " + capacity + " человек");
    }
}