import command.Command;
import command.MagicBoardController;
import command.NeedBikeCommand;
import command.NeedDollCommand;
import observer.MagicBoard;
import singleton.SantaClaus;

public class Main {
    public static void main(String[] args) {

        SantaClaus santaClaus = SantaClaus.getInstance();

        santaClaus.sayNeedDoll();
        santaClaus.sayNeedBike();

    }
}
