package patternsjava.behavioral.command;

import javax.swing.*;

public class Invoker {

   private Command command;

    public Invoker() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
