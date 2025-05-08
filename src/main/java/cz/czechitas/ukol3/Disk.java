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
    }

    @Override
    public String toString() {
            return "Kapacita disku: " + kapacita + "bajtu, z toho vyuzito: " + vyuziteMisto + "bajtu.";
    }
}
