package Models;

public abstract class Enemy {

    private String name;
    private int level;
    private int health = 100;
    private int baseDamage = 20;

    public Enemy(String name, int level, int health, int baseDamage) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getLevel() {
        return level;
    }

    public String getInfo() {
        return ".:Enemigo:." +
                "Nombre del enemigo: " + name +
                "\nNivel: " + level +
                "\nSalud: " + health +
                "\nDaño por turno: " + baseDamage;
    }

    public Boolean isDead() {
        return this.health <= 0;
    }

    public void takeDamage(int cantidad) {
        if (cantidad <= 0) return;

        this.health -= cantidad;
        if (this.health < 0) this.health = 0;
    }
}
