package site.telion;

public class Car extends Transport implements withTyres, withEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

}
