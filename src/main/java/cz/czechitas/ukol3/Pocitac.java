package cz.czechitas.ukol3;

public class Pocitac {

    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean jeZapnuty;

    public void zapniSe() {

       if (jeZapnuty == true) {
           System.err.println("Pocitac uz je zapnuty.");
       } else {
           jeZapnuty = true;
           System.out.println("Pocitac se zapnul.");
       }

    }

    public void vypniSe() {
        jeZapnuty = false;
        System.out.println("Pocitac se vypnul.");
    }

    @Override
    public String toString() {
        if (jeZapnuty == true) {
            return "CPU procesoru: " + cpu
                    + ", pamet RAM: " + ram
                    + ", pevny disk: " + pevnyDisk
                    + ". Pocitac je zapnuty.";
        } else {
            return "CPU procesoru: " + cpu
                    + ", pamet RAM: " + ram
                    + ", pevny disk: " + pevnyDisk
                    + ". Pocitac je vypnuty.";
        }
    }
}
