package Models;

public enum Genero {

    HOMBRE("Hombre"), MUJER("Mujer");

    private String genero;
    Genero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    @Override
    public String toString(){
        return getGenero();
    }
}
