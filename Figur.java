public class Figur {

    // fields
    private int lebenspunkte;
    private int angriffswert;

    // life cycle
    public Figur(int pLebenspunkte, int pAngriffswert) {
        lebenspunkte = pLebenspunkte;
        angriffswert = pAngriffswert;
    }

    // member
    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int pLebenspunkte) {
        lebenspunkte = pLebenspunkte;
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int pAngriffswert) {
        angriffswert = pAngriffswert;
    }
}