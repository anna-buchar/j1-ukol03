package cz.czechitas.ukol3;

public class Disk {

    private long kapacita;
    private long vyuziteMisto;

    @Override
    public String toString() {
//        if (kapacita == 0) {
//            System.err.println("Chybi disk.");
//            return "";
//        } else if (vyuziteMisto >= kapacita) {
//            System.err.println("Kapacita disku je plna.");
//            return "";
//        } else {
            return "Kapacita disku: " + kapacita + ", z toho vyuzito: " + vyuziteMisto + ".";
//        }
    }
}
