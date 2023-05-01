package patternsjava.structural.flyweight.characters;

import patternsjava.structural.flyweight.Enemy;

public class Detective implements Enemy {
    private String weapon;
    private final String LIFE;

    public Detective(){
        LIFE = "1000";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("The weapon of detective is: " + weapon);
    }

    @Override
    public void lifePoints() {
        System.out.println("The life of a detective is: " + LIFE);
    }
}
