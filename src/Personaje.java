public abstract class Personaje {

    private final String breed;
    private final String gender;
    private final String server;
    private final String name;
    private Integer level = 1;
    private Integer health = 100;
    private final Integer xp = 0;


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

}


