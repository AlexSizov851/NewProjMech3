
// Класс корабля
public class Ship extends Transportprops implements Refuel {

    // Двигатель корабля
    private Engine engine;
    // Уровень топлива
    private int fuelLevel;
    // Водоизмещение корабля
    private int displacement;

    public Ship(String name, int maxSpeed, int capacity, Engine engine, int displacement) {
        super(name, maxSpeed, capacity);
        this.engine = engine;
        this.displacement = displacement;
        this.fuelLevel = 0;
    }
    @Override
    public void move() {
        System.out.println(" \n Двигатель " + engine.type + " включен");
        System.out.println(name + " плывёт по воде");
    }
    @Override
    public void stop() {
        System.out.println("\n Корабаль "+ name + " остановился, бросил якорь");
        System.out.println("Двигатель " + engine.type + " выключен");
    }
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
    @Override
    public void displayInfo() {
        System.out.println("\n Информация о корабле: " + name);
        System.out.println("Макс. скорость: " + maxSpeed + " узлов");
        System.out.println("Водоизмещение: " + displacement + " тонн");
        System.out.println("Вместимость: " + capacity + " человек");
        System.out.println("Тип двигателя: " + engine.type);
        System.out.println("Уровень топлива: " + fuelLevel + " литров");
    }
}