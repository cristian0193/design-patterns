package patternsjava.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private List<Component> listComponent;

    public Composite(){
        this.listComponent = new ArrayList<>();
    }

    @Override
    public void showAccountName() {
        for (Component component: listComponent){
            component.showAccountName();
        }
    }

    @Override
    public Double getAmount() {
        Double total = 0.0;
        for (Component component: listComponent){
            total += component.getAmount();
        }
        System.out.println("Amounts: " + total);
        return total;
    }

    public void addAccount(Component component){
        listComponent.add(component);
    }

    public void removeAccount(Component component){
        listComponent.remove(component);
    }
}
