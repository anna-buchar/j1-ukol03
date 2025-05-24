package cz.czechitas.ukol3;

public class Pocitac {

    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean jeZapnuty;

    public Procesor getCpu() {
        return cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }


    public void zapniSe() {
        if (cpu == null) {
            System.err.println("Chybi procesor.");
            return;
        }
        if (ram == null) {
            System.err.println("Chybi pamet.");
            return;
        }
        if (pevnyDisk == null) {
            System.err.println("Chybi disk.");
            return;
        }

       if (jeZapnuty == true) {
           System.err.println("Pocitac uz je zapnuty.");
       } else {
           jeZapnuty = true;
           System.out.println("Pocitac se zapnul.");
       }

    }

    public void vypniSe() {
        if (jeZapnuty == false) {
            System.out.println("Pocitac uz je vypnuty.");
        } else {
            jeZapnuty = false;
            System.out.println("Pocitac se vypnul.");
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            long aktualniVyuziteMisto = pevnyDisk.getVyuziteMisto();
            long noveVyuziteMisto = aktualniVyuziteMisto + velikost;
            pevnyDisk.setVyuziteMisto(noveVyuziteMisto);
            System.out.println("Vyuzite misto: " + noveVyuziteMisto);
        } else {
            System.err.println("Pocitac je vypnuty.");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            long aktualniVyuziteMisto = pevnyDisk.getVyuziteMisto();
            long noveVyuziteMisto = aktualniVyuziteMisto - velikost;
            pevnyDisk.setVyuziteMisto(noveVyuziteMisto);
            System.out.println("Vyuzite misto: " + noveVyuziteMisto);
        } else {
            System.err.println("Pocitac je vypnuty.");
        }
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    @Override
    public String toString() {
        if (jeZapnuty) {
            return cpu.toString() + "\n"
                    + ram.toString() + "\n"
                    + pevnyDisk.toString() + "\n"
                    + "Pocitac je zapnuty.";
        } else {
            return cpu.toString() + "\n"
                    + ram.toString() + "\n"
                    + pevnyDisk.toString() + "\n"
                    + "Pocitac je vypnuty.";
        }
    }
}
