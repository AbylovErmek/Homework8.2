package players;

import java.util.Random;

public class Hacker extends Hero {

    public Hacker(int health, int damage, String name, SuperPower change) {
        super(health, damage, name, change);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getDamage()> 0 && boss.getDamage()<random.nextInt() ) {
                if (this.getHealth()>0){
                    heroes[i].setHealth(heroes[i].getHealth());
                }
            }
        }
    }
}
