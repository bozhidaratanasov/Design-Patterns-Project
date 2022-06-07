package abstractfactory;

public class Bike implements Toy{
    @Override
    public void bring() {
        System.out.println("Successfully brought a bike");
    }
}
