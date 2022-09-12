import javax.print.attribute.standard.Sides;

public class Heiler {
    private VerletzterHeld first;
    private VerletzterHeld last;
    private int size;

    public Heiler() {

    }

    public void patientAufnehmen(Held pHeld) {

        // Wenn sich niemand in der WArtesclange befindet zeigt der Zeiger von last auf
        // nichts (nichts = null)
        if (last == null) {

            // Wenn in der Warteschlange kein verletzter Held ist, wird der Held in die
            // Warteschlange hineingesetzt. Ihm wird ein Platz zugewiesen.
            VerletzterHeld vh = new VerletzterHeld(pHeld);

            //
            first = vh;
            last = vh;
        } else {
            VerletzterHeld vh = new VerletzterHeld(pHeld);
            last.setNext(vh);
            last = vh;
        }
        size++;
    }

    public void heilen() {
        // Es wird geprüft ob sich ein Held in der Warteschlage befindet.
        if (first != null) {

            // Der erste Held der sich in der Warteschlange befindet wird
            // zwischengespeichert.
            VerletzterHeld vh = first;

            // Es gibt immer einen Zeiger der auf den ersten Helden in der Warteschlange
            // zeigt.
            // Dieser wird nun auf den nächsten in der Schlange gezeigt. (Kurz: Der zweite
            // wird zum ersten).
            first = vh.getNext();

            // Der Held der zwischen gespeichert wurde hat noch eine Verbindung zum zweiten
            // Helden der aufgerutscht ist.
            // Diese wird nun gelöscht.
            vh.setNext(null);

            // Die Anzahl der Helden wird reduziert. Der zwischengespeicherte wird zum
            // Heiler geholt und verlässt die Warteschlange
            size--;

            // Die Lebenspunkte des zwischengespeicherten Heldens werden ausgelesen,
            // zwischengespeichert,
            // um 10 punkte erhöht und an den Helden zurückgeschrieben.
            int heldLebenspunkte = vh.getPatient().getLebenspunkte();
            heldLebenspunkte += 10;
            vh.getPatient().setLebenspunkte(heldLebenspunkte);
        }

    }

}
