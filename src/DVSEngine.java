
// ДВС Двигатель
public final class DVSEngine extends Engine {

    // Тип топлива
    private FuelTypes fuelType;

    public DVSEngine(int power, FuelTypes fuelType) {
        super(EngineTypes.INTCOMENGINE, power);
        this.fuelType = fuelType;
    }

    public FuelTypes getFuelType() {
        return fuelType;
    }
}