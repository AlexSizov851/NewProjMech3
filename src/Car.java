
// Класс автомобиля
public class Car extends Transportprops implements Refuel {

    // Двигатель авто
    private Engine engine;
    // Уровень топлива
    private int fuelLevel;

    public Car(String name, int maxSpeed, int capacity, Engine engine) {
        super(name, maxSpeed, capacity);
        this.engine = engine;
        // Начальный уровень топлива
        this.fuelLevel = 0;
    }
    // Реализация методов из интерфейса Movement
    @Override
    public void move() {
        System.out.println("\n Двигатель " + engine.type + " включен");
        System.out.println("Автомобиль " + name + " едет по дороге");
    }
    @Override
    public void stop() {
        System.out.println("\n Двигатель " + engine.type + " выключен");
        System.out.println("Автомобиль " + name + " остановился");
    }
    // Реализация методов из интерфейса Refuel
    @Override
    public void refuel(int amount) {
        this.fuelLevel += amount;
        System.out.println("\n Заправлено " + amount + " литров");
        System.out.println("Текущий уровень топлива: " + fuelLevel);
    }
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
    // Реализация абстрактного метода из Transportprops
    @Override
    public void displayInfo() {
        System.out.println("\n Информация о автомобиле: " + name);
        System.out.println("Макс. скорость: " + maxSpeed + " км/ч");
        System.out.println("Вместимость: " + capacity + " человек");
        System.out.println("Тип двигателя: " + engine.type);
        System.out.println("Уровень топлива: " + fuelLevel + "литров");
    }
}