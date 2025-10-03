
// Класс самолета
public class Airplane extends Transportprops implements Refuel {

    // Двигатель самолета
    private Engine engine;
    // Уровень топлива
    private int fuelLevel;
    // Максимальная высота полета
    private int maxAltitude;

    public Airplane(String name, int maxSpeed, int capacity, Engine engine, int maxAltitude) {
        super(name, maxSpeed, capacity);
        this.engine = engine;
        this.maxAltitude = maxAltitude;
        // Начальный уровень топлива
        this.fuelLevel = 0;
    }
    @Override
    public void move() {
        System.out.println("\n Двигатель " + engine.type + " включен");
        System.out.println("Самолет " + name + " летит в небе");
    }
    public void stop() {
        System.out.println("\n Самолет " + name + " остановился на взлетной полосе");
        System.out.println("Двигатель " + engine.type + " выключен");
    }
    @Override
    public void refuel(int amount) {
        this.fuelLevel += amount;
        System.out.println("\n Заправлено: " + amount + " литров");
        System.out.println("Текущий уровень топлива: " + fuelLevel);
    }
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
    @Override
    public void displayInfo() {
        System.out.println("\n Информация о самолете: " + name);
        System.out.println("Макс. скорость: " + maxSpeed + " км/ч");
        System.out.println("Макс. высота: " + maxAltitude + " метров");
        System.out.println("Вместимость: " + capacity + " пассажиров");
        System.out.println("Тип двигателя: " + engine.type);
        System.out.println("Уровень топлива: " + fuelLevel + "литров");
    }
}