package site.telion;

public class Bicycle extends Transport implements withTyres {

    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelCount(); i++) {
            updateTyre();
        }
    }

}
