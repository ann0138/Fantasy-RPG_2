public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's start the game");

        Held aragon = new Held("Aragon", 30, 70);
        Held gimly = new Held("Gimly", 40, 70);
        Held legolas = new Held("Legolas", 45, 70);

        Heiler heiler = new Heiler();

        heiler.patientAufnehmen(aragon);
        heiler.patientAufnehmen(gimly);
        heiler.patientAufnehmen(legolas);
        heiler.heilen();
        System.out.println(aragon.getLebenspunkte());
        heiler.heilen();
        System.out.println(gimly.getLebenspunkte());
        heiler.heilen();
        System.out.println(legolas.getLebenspunkte());

    }
}
