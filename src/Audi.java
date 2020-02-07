public class Audi implements Build{
    @Override
    public void build() {
        System.out.println("Building an Audi for you");
    }

    @Override
    public void repair() {
        System.out.println("Repairing your broken Audi");
    }
}
