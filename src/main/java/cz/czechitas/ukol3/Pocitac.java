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
        }
        if (ram == null) {
            System.err.println("Chybi pamet.");
        }
        if (pevnyDisk == null) {
            System.err.println("Chybi disk.");
        }

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
        if (jeZapnuty == false) {
            return cpu.toString() + "\n"
                    + ram.toString() + "\n"
                    + pevnyDisk.toString() + "\n"
                    + "Pocitac je vypnuty.";
        } else {
            return cpu.toString() + "\n"
                    + ram.toString() + "\n"
                    + pevnyDisk.toString() + "\n"
                    + "Pocitac je zapnuty.";
        }
    }
}
