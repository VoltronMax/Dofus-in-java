package Models;

public abstract class Personaje {
    //Variables estaticas que persisten para condiciones y bases
    private static final int MAX_HEALTH = 100;
    private static final int XP_LEVEL = 100;

    //Atributos basicos que heredaran las razas jugables
    private final String breed;
    private final String gender;
    private final String server;
    private final String name;
    private Integer level = 1;
    private Integer health = MAX_HEALTH;
    private Integer xp = 0;


    //Constructor con los atributos no inicializados
    public Personaje (String breed, String gender, String server, String name){
        this.breed = breed;
        this.gender = gender;
        this.server = server;
        this.name = name;
    }

    //Getters

    //Raza
    public String getBreed(){
        return breed;
    }

    //Genero
    public String getGender(){
        return gender;
    }

    //Servidor
    public String getServer(){
        return server;
    }

    //Nombre del pj
    public String getName(){
        return name;
    }

    //Nivel actual del pj
    public Integer getLevel(){
        return level;
    }

    //Vida actual del pj
    public Integer getHealth(){
        return health;
    }

    //Experiencia recibida
    public Integer getXp(){
        return xp;
    }

    //Para atacar usando un equipable
    public abstract void atq(String weapon);

    //Aumenta el nivel del jugador y sube su vida maxima al limite
    public void increaseLvl(){
        this.level++;
        this.health = MAX_HEALTH;
    }

    //Agrega xp a la barra actual
    public void gainXp(int cantidad){
        if (cantidad<=0) return;

        int newXP = this.xp + cantidad;

        //Si la cantidad de experiencia a recibir es mayor al limite, se resta para obtener el restante y agregarselo al nivel que subio
        while (newXP>=XP_LEVEL){
            newXP -= XP_LEVEL;
            increaseLvl();
        }
        //Asigna la experiencia correspondiente
        this.xp = newXP;
    }

    //Resta la salud actual del pj segun la cantidad de daño enviado
    public void takeDamage(int cantidad){
        if (cantidad<=0) return;

        this.health -= cantidad;
        if (this.health<0) this.health = 0;
    }

    //Restaura x cantidad de salud a la misma
    public void cure(int cantidad){
        if (cantidad <=0) return;

        this.health += cantidad;
        if(this.health> MAX_HEALTH) this.health = MAX_HEALTH;
    }


    //Resumen de caracteristicas
    public String getInfo(){
        return ".:Datos del jugador.:" +
                "Nombre: " + getName() +
                "\nGenero: " + getGender() +
                "\nRaza: " + getBreed() +
                "\nSalud: " + getHealth() +
                "\nNivel: " + getLevel() +
                "\nExperiencia: " + getXp();
    }

    public boolean isDead(){
            return health<=0;
    }
}


