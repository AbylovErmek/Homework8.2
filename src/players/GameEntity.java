package players;

public class GameEntity {
    private int Health;
    private int Damage;
    public String name;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameEntity(int health, int damage, String name) {
        Health = health;
        Damage = damage;
        this.name = name;
    }
}
