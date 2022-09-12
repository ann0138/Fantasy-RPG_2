import java.util.Properties;

public class Held extends Figur {

    private int staerke;
    private String name;

    public Held(String pName, int pLebenspunkte, int pAngriffswert) {
        super(pLebenspunkte, pAngriffswert);
        name = pName;
    }

    public int getStaerke() {
        return staerke;
    }

    public int angriffswertBerechnen() {
        return getAngriffswert();
    }

    public void waffeAufnehmen(Waffe pWaffe) {

    }
}
