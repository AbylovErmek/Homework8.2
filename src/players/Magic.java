package players;

import java.util.Random;

public class Magic extends Hero{
    public Magic(int health, int damage, String name) {
    super(health, damage, name, SuperPower.BOOST);
}

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int heal = 2+r.nextInt(10);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0 && heroes[i].getDamage()>0){
                if(this.getHealth()>0){
                    boss.setHealth(boss.getHealth()-heal);
                }
            }
        }
        if(this.getHealth()>0){
            System.out.println(this.getName()+" |Добавил всем живым по "+heal+" урона");
        }
    }
}
