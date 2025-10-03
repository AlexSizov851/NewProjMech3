
// Абстрактный класс для общих свойств всего транспорта
public abstract class Transportprops implements Movement {

    // Переменная для названия транспорта
    protected String name;
    // Для максимальной скорости
    protected int maxSpeed;
    // для вместимости
    protected int capacity;

    // Конструктор для создания транспорта
    public Transportprops(String name, int maxSpeed, int capacity) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }
    // Абстрактный метод
    public abstract void displayInfo();

    public String getName()
    { return name;    }
    public int getMaxSpeed()
    { return maxSpeed; }
    public int getCapacity()
    { return capacity; }
}