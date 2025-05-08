package cz.czechitas.ukol3;

public class Procesor {

    private String vyrobce;
    private long rychlost;

    public String getVyrobce() {
        return vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    @Override
    public String toString() {
        return "Vyrobce procesoru: " + vyrobce + ", rychlost procesoru: " + rychlost + "Hz.";
    }

}
