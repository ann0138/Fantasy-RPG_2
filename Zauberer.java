public class Zauberer extends Held {

    private int zauberkraft;

    public Zauberer(String pName, int pLebenspunkte, int pAngriffswert, int pZauberkraft) {
        super(pName, pLebenspunkte, pAngriffswert);
        zauberkraft = pZauberkraft;
    }

    public void heilen() {
        int lebenspunkte = getLebenspunkte();
        lebenspunkte += 5;
        setLebenspunkte(lebenspunkte);
    }
}
