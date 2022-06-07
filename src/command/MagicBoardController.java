package command;

public class MagicBoardController {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void writeToMagicBoard() {
        if (this.command == null) {
            System.out.println("Santa Claus hasn't spoken yet!");
            return;
        }

        this.command.execute();
    }
}
