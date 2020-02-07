public class BMW implements Build {

    @Override
    public void build() {
        System.out.println("Building an BMW for you");
    }

    @Override
    public void repair() {
        System.out.println("Repairing your broken BMW");
    }
}
