package command;

import observer.MagicBoard;

public class NeedBikeCommand implements Command {

    private MagicBoard magicBoard;

    public NeedBikeCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        this.magicBoard.writeBike();
    }
}
