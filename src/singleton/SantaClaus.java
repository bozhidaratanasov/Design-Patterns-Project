package singleton;

import command.Command;
import command.MagicBoardController;
import command.NeedBikeCommand;
import command.NeedDollCommand;
import observer.Dwarf;
import observer.MagicBoard;
import observer.Observer;

public class SantaClaus {

    private static SantaClaus instance;

    private MagicBoard magicBoard;
    private MagicBoardController magicBoardController;


    private SantaClaus() {

    }

    public static SantaClaus getInstance() {
        if (instance == null)
            instance = new SantaClaus();

        return instance;
    }

    public void sayNeedDoll() {
        magicBoard = new MagicBoard();
        magicBoardController = new MagicBoardController();

        Command needDollCommand = new NeedDollCommand(magicBoard);


        Observer dwarf = new Dwarf("Goshko");
        magicBoard.subscribe(dwarf);

        magicBoardController.setCommand(needDollCommand);
        magicBoardController.writeToMagicBoard();


    }

    public void sayNeedBike() {
        magicBoard = new MagicBoard();
        magicBoardController = new MagicBoardController();

        Command needBikeCommand = new NeedBikeCommand(magicBoard);

        magicBoardController.setCommand(needBikeCommand);
        magicBoardController.writeToMagicBoard();

    }

}
