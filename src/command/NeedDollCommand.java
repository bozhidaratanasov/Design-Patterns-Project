package command;

import observer.MagicBoard;

public class NeedDollCommand implements Command {

    private MagicBoard magicBoard;

    public NeedDollCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }


    @Override
    public void execute() {
        this.magicBoard.writeDoll();
    }
}
