package Models;
import Interface.IOsamodas;

public class Osamoda extends Personaje implements IOsamodas {

    public Osamoda(Razas race, String gender, String server, String name) {
        super(race, gender, server, name);
    }

    @Override
    public Integer atqScream() {
        return 10;
    }

    @Override
    public Integer atqSpikes() {
        return 0;
    }

    @Override
    public Integer atqTheeth() {
        return 0;
    }

    @Override
    public Integer atqBear() {
        return 0;
    }

    @Override
    public Integer atqWhip() {
        return 0;
    }

    @Override
    public void invTofu() {

    }

    @Override
    public void invJalato() {

    }

    @Override
    public void invSaponito() {

    }

    @Override
    public void invDragun() {

    }

    @Override
    public void sptComunion() {

    }

    @Override
    public void atq(String weapon) {

    }

}
