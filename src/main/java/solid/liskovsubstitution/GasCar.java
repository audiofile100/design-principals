package solid.liskovsubstitution;

/**
 * Created by mg on 8/16/2023.
 */
public class GasCar implements Car {

    private Engine engine;

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate(int mph) {
        engine.setRPM(mph);
    }
}
