package site.telion;

public interface withEngine {

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
