package patternsjava.structural.flyweight;

import patternsjava.structural.facade.Market;

import java.util.Random;

public class RunMethod {

    private static String[] enemyType = {"Private", "Detective"};
    private static String[] weapon = {"Fusil", "Revolver", "Pistola", "Metralladora", "Lanza Granada", "9mm"};

    public static void runFlyweight(){

        for (int i = 0; i < 15; i++) {
            Enemy enemy = Factory.getEnemy(getRandomType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }

    }

    public static String getRandomType(){
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];
     }

    public static String getRandomWeapon(){
        Random r = new Random();
        int randInt = r.nextInt(weapon.length);
        return weapon[randInt];
    }

}
