package abstractfactory;

public class Doll implements Toy {
    @Override
    public void bring() {
        System.out.println("Successfully brought a Doll");
    }
}
