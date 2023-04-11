package patternsjava.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Carataker {

    List<ArticleMemento> articleMementoList = new ArrayList<>();

    public void addMemento(ArticleMemento articleMemento){
        articleMementoList.add(articleMemento);
    }

    public ArticleMemento getMemento(int position){
        return articleMementoList.get(position);
    }

}
