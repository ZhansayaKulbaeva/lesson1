public class Main {
    public static void main(String[] args) {
        FerrariEngine ferrariEngine = new FerrariEngine(5,88,17);

        System.out.println("Engine Volume: " + ferrariEngine.getEngineVolume());
        System.out.println("Cylinder Amount: " + ferrariEngine.getCylinderAmount());
        System.out.println("Engine Weight: " + ferrariEngine.getEngineWeight());
        System.out.println("MAX: " + ferrariEngine.getMaxSpeed());
    }
}
