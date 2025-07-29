package Models;

public abstract class Invocation{

    private static final int MAX_HEALTH = 100;
    private String name;
    private Integer level;
    private Integer health = MAX_HEALTH;
    private Integer baseDamage;

    public Invocation (String name, Integer lvl){
        this.name = name;
        this.level = lvl;
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

    

}
