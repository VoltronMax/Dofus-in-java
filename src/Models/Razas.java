package Models;

public enum Razas {
    OSAMODA("osamoda"), UGINAK("uginak"), FECA("feca"), ANUTROF("anutrof"), SRAM("sram"),
    XELOR("xelor"), ZURCARAK("zucarak"), ANIRIPSA("aniripsa"), YOPUKA("yopuka"), OCRA("ocra"),
    SADIDA("sadida"), SACROGRITO("sacrogrito"), PANDAWA("pandawa"), TYMADOR("tymador"), ZOBAL("zobal"),
    STEAMER("steamer"), SELOTROP("selotrop"), HIPERMAGO("hipermago"), FORJALANZA("forjalanza");

    private String race;


    Razas(String race) {
        this.race = race;
    }

    public String getRace(){
        return race;
    }

    @Override
    public String toString() {
        return getRace();
    }
}
