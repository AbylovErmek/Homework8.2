package players;

import java.util.Random;

public class Berserk extends Hero {
    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperPower.SAVE_DAMEGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int block = 5+r.nextInt(15);
        boss.setHealth(boss.getHealth()-block);
        this.setHealth(this.getHealth()+block);
        System.out.println(this.getName()+" |Заблоокировал "+block+" и вернул "+(block +this.getDamage())+" урона");
    }
}

