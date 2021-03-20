package players;

import java.util.Random;

public class Avrora extends Hero {
    public Avrora(int health, int damage, String name) {
        super(health, damage, name, SuperPower.DOUBLE_ARROW);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        boolean random = r.nextBoolean();
        int block = boss.getDamage()/2;
        if(this.getHealth()>0){
            this.setHealth(this.getHealth()+block);
        }
        if(random){
            boss.setHealth(boss.getHealth()-this.getDamage());
        }

    }
}
