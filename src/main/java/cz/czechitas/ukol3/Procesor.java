package cz.czechitas.ukol3;

public class Procesor {

    private String vyrobce;
    private long rychlost;

    @Override
    public String toString() {
        return "Vyrobce procesoru: " + vyrobce + ", rychlost procesoru: " + rychlost + ".";
    }
}
