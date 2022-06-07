package observer;

public class Dwarf implements Observer {

    private Observable magicBoard;
    private String name;

    public Dwarf(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (this.magicBoard == null) {
            System.out.println(this.name + " isn't currently looking to the magic board");
            return;
        }

        System.out.println(this.name + " has to bring a " +  this.magicBoard.getToy());
    }

    @Override
    public void setMagicBoard(Observable magicBoard) {
        this.magicBoard = magicBoard;
    }
}
