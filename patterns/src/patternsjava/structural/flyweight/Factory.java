package patternsjava.structural.flyweight;

import patternsjava.structural.flyweight.characters.Detective;
import patternsjava.structural.flyweight.characters.Private;

import java.util.HashMap;

public class Factory {

    private static HashMap<String, Enemy> enemys = new HashMap<>();

    public static Enemy getEnemy(String type){
        Enemy enemy = null;
        if (enemys.containsKey(type)){
            enemy = enemys.get(type);
        }else{
            switch (type){
                case "Private":
                    System.out.println("Soldier Created");
                    enemy = new Private();
                    break;
                case "Detective":
                    System.out.println("Detective Created");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("No create Enemy");
            }
            enemys.put(type, enemy);
        }
        return enemy;
    }


}
