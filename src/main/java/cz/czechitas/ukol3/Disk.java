package cz.czechitas.ukol3;

public class Disk {

    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
        if (vyuziteMisto > kapacita) {
            System.err.println("Kapacita disku je plna.");
        }
        if (vyuziteMisto < 0) {
            System.err.println("Vyuzite misto nemuze byt mensi nez 0.");
        }
    }

    @Override
    public String toString() {
            return "Kapacita disku: " + kapacita + "bajtu, z toho vyuzito: " + vyuziteMisto + "bajtu.";
    }
}
