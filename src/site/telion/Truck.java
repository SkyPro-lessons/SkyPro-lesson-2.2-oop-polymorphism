package site.telion;

public class Truck extends Transport implements withTyres, withEngine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

}
