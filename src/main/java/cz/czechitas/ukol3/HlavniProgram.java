package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        Pocitac mujPocitac = new Pocitac();

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(2_900_000_000L);
        mujProcesor.setVyrobce("Intel");

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(256_624_295_936L);
        mujDisk.setVyuziteMisto(214_748_364_800L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(12_884_901_888L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        mujPocitac.zapniSe();
        System.out.println(mujPocitac.toString());

        System.out.println("Program spuštěn.");
    }

}
