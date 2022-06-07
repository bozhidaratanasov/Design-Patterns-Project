package singleton;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.Toy;
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
    Command command;
    Observer dwarf;
    AbstractFactory toyFactory;


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

        command = new NeedDollCommand(magicBoard);


        dwarf = new Dwarf("Goshko");
        magicBoard.subscribe(dwarf);

        magicBoardController.setCommand(command);
        magicBoardController.writeToMagicBoard();

        toyFactory = FactoryProducer.getFactory("Toy");
        Toy doll = toyFactory.getToy("Doll");
        doll.bring();

    }

    public void sayNeedBike() {
        magicBoard = new MagicBoard();
        magicBoardController = new MagicBoardController();

        command = new NeedBikeCommand(magicBoard);

        dwarf = new Dwarf("Goshko");
        magicBoard.subscribe(dwarf);

        magicBoardController.setCommand(command);
        magicBoardController.writeToMagicBoard();

        toyFactory = FactoryProducer.getFactory("Toy");
        Toy bike = toyFactory.getToy("Bike");
        bike.bring();

    }
}
