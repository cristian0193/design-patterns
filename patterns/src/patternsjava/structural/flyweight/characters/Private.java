package patternsjava.structural.flyweight.characters;

import patternsjava.structural.flyweight.Enemy;

public class Private implements Enemy {

    private String weapon;
    private final String LIFE;

    public Private(){
        LIFE = "200";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("The weapon of soldier is: " + weapon);
    }

    @Override
    public void lifePoints() {
        System.out.println("The life of a soldier is: " + LIFE);
    }
}
