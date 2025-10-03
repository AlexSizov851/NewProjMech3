
//Базовый класс двигателя, запечатанный
public sealed class Engine permits DVSEngine, ReactiveEngine {

    // Тип двигателя
    protected EngineTypes type;

    // Мощность двигателя
    protected int power;

    public Engine(EngineTypes type, int power) {
        this.type = type;
        this.power = power;
    }

    public void start() {}

    public void stop() {}
}