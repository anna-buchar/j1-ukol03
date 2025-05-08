package cz.czechitas.ukol3;

public class Procesor {

    private String vyrobce;
    private long rychlost;

    @Override
    public String toString() {
//        if (rychlost == 0) {
//            System.err.println("Chybi procesor.");
//        }
        return "Vyrobce procesoru: " + vyrobce + ", rychlost procesoru: " + rychlost + ".";
    }
}
