package Models;

public abstract class Personaje {
    private static final int MAX_HEALTH = 100;
    private static final int XP_LEVEL = 100;

    private final String breed;
    private final String gender;
    private final String server;
    private final String name;
    private Integer level = 1;
    private Integer health = MAX_HEALTH;
    private Integer xp = 0;


    public Personaje (String breed, String gender, String server, String name){
        this.breed = breed;
        this.gender = gender;
        this.server = server;
        this.name = name;
    }

    //Getters
    public String getBreed(){
        return breed;
    }

    public String getGender(){
        return gender;
    }

    public String getServer(){
        return server;
    }

    public String getName(){
        return name;
    }

    public Integer getLevel(){
        return level;
    }

    public Integer getHealth(){
        return health;
    }

    public Integer getXp(){
        return xp;
    }

    public abstract void atq(String weapon);

    public void increaseLvl(){
        this.level++;
        this.health = MAX_HEALTH;
    }

    public void gainXp(int cantidad){
        if (cantidad<=0) return;

        int newXP = this.xp + cantidad;

        while (newXP>=XP_LEVEL){
            newXP -= XP_LEVEL;
            increaseLvl();
        }
        this.xp = newXP;
    }

    public void takeDamage(int cantidad){
        if (cantidad<=0) return;

        this.health -= cantidad;
        if (this.health<0) this.health = 0;
    }

    public void cure(int cantidad){
        if (cantidad <=0) return;

        this.health += cantidad;
        if(this.health> MAX_HEALTH) this.health = MAX_HEALTH;
    }


    public String getInfo(){
        return ".:Datos del jugador.:" +
                "Nombre: " + getName() +
                "\nGenero: " + getGender() +
                "\nRaza: " + getBreed() +
                "\nSalud: " + getHealth() +
                "\nNivel: " + getLevel() +
                "\nExperiencia: " + getXp();
    }
}


