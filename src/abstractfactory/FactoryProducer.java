package abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName) {
        if (factoryName.equals("Toy"))
            return new ToyFactory();

        System.out.println("Unknown Factory");
        return null;
    }
}
