public class VerletzterHeld {
    private Held patient;
    private VerletzterHeld next;

    public VerletzterHeld(Held pHeld) {
        patient = pHeld;
    }

    public void setPatient(Held pHeld) {
        patient = pHeld;
    }

    public void setNext(VerletzterHeld pNext) {
        next = pNext;
    }

    public Held getPatient() {
        return patient;
    }

    public VerletzterHeld getNext() {
        return next;
    }
}
