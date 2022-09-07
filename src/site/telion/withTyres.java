package site.telion;

public interface withTyres {

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
