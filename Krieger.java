public class Krieger extends Held {

    private int ausdauer;

    public Krieger(String pName, int pLebenspunkte, int pAngriffswert, int pAusdauer) {
        super(pName, pLebenspunkte, pAngriffswert);
        ausdauer = pAusdauer;
    }

    public int angriffswertBerechnen() {
        return getAngriffswert() * ausdauer;
    }
}
