
// Интерфейс для всего, что можно заправить
public interface Refuel {

    // Метод для заправки
    void refuel( int amount);

    // Метод для получения уровня топлива
    int getFuelLevel();
}