package players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
   private SuperPower superPower;


    public Hero(int health, int damage, String name, SuperPower change) {
        super(health, damage, name);
    }

    public SuperPower getSuperPower() {
        return superPower;
    }

    public void setSuperPower(SuperPower superPower) {
        this.superPower = superPower;
    }
}
