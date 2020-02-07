public class Volkswagen implements Build {
    @Override
    public void build() {
        System.out.println("Building an Volkswagen for you");
    }

    @Override
    public void repair() {
        System.out.println("Repairing your broken Volkswagen");
    }
}
