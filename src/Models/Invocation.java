package Models;

public abstract class Invocation{
    private static final int MAX_HEALTH = 100;

    final private String name;
    private Integer level;
    private Integer health = MAX_HEALTH;

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

    public void takeDamage(int cantidad){
        if (cantidad<=0) return;

        this.health -= cantidad;
        if (this.health<0) this.health = 0;
    }
}
