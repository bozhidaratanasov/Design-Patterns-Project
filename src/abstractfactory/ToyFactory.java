package abstractfactory;

public class ToyFactory extends AbstractFactory{
    @Override
    public Toy getToy(String toyName) {
        if (toyName.equals("Doll"))
            return new Doll();

        else if (toyName.equals("Bike"))
            return new Bike();

        System.out.println("There is no such toy in the workshop!");
        return null;
    }
}
