
//  Реактивный двигатель
public final class ReactiveEngine extends Engine {
    private FuelTypes fuelType;  // Тип топлива

    public ReactiveEngine(int power, FuelTypes fuelType) {

        // конструктор родительского класса
        super(EngineTypes.JETENGINE, power);
        this.fuelType = fuelType;
    }

    public FuelTypes getFuelType() {
        return fuelType;
    }
}