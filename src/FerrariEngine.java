abstract class Engine {
    private double engineVolume;
    private int cylinderAmount;
    private double engineWeight;

    public Engine() {

    }

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    abstract double efficiency();

    abstract double throttleEnergy();

    abstract double breakEnergy();

    public double getMaxSpeed() {
        return (throttleEnergy() - breakEnergy()) * efficiency();
    }
}

public class FerrariEngine extends Engine {

    public FerrariEngine() {

    }

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    double efficiency() {
        return 0.25;
    }

    @Override
    double throttleEnergy() {
        return getEngineVolume() * getCylinderAmount() * 100;
    }

    @Override
    double breakEnergy() {
        return getEngineWeight() * 2;
    }
}