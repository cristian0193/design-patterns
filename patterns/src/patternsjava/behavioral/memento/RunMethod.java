package patternsjava.behavioral.memento;

public class RunMethod {

    public static void runMemento(){
        Carataker carataker = new Carataker();
        Article article = new Article("JK Rowling", "Harry Potter Piedra Filosofal");

        // first save
        carataker.addMemento(article.createMemento());

        article.setText(article.getText() + " Camara de los Secretos");

        // second save
        carataker.addMemento(article.createMemento());

        ArticleMemento article1 = carataker.getMemento(0);

        article.restoreMemento(article1);
        System.out.println(article1.getAutor());
        System.out.println(article1.getText());

        ArticleMemento article2 = carataker.getMemento(1);

        article.restoreMemento(article2);
        System.out.println(article2.getAutor());
        System.out.println(article2.getText());

    }

}
