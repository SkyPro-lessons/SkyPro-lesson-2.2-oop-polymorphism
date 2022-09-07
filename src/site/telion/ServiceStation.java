package site.telion;

public class ServiceStation {

    public void check(Transport transport) {
        if (transport != null) {
            System.out.println();
            transport.check();
        }
    }

}
