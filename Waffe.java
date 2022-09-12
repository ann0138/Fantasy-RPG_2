public class Waffe {
    private int schadensbonus;
    private String material;
    private int magie;

    public Waffe(String pMaterial, int pMagie) {
        material = pMaterial;
        magie = pMagie;

        schadensbonusBerechnen();
    }

    public void schadensbonusBerechnen() {
        // Default materialSchaden wenn kein Material
        int materialSchaden = 0;

        // Wenn Holz
        if (material == "Holz") {
            materialSchaden = 2;
        }
        // wenn eisen
        if (material == "Eisen") {
            materialSchaden = 4;
        }

        setSchadensbonus(materialSchaden + magie);
    }

    public int getSchadensbonus() {
        return schadensbonus;
    }

    public void setSchadensbonus(int pSchadensbonus) {
        schadensbonus = pSchadensbonus;
    }

    public String getMaterial() {
        return material;
    }

    public int getMagie() {
        return magie;
    }
}
