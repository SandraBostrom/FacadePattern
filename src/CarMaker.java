public class CarMaker {
    private Build BMW;
    private Build Audi;
    private Build Volkswagen;

    public CarMaker(){
        BMW = new BMW();
        Audi = new Audi();
        Volkswagen = new Volkswagen();
    }
    public void repairAudi(){
        Audi.repair();
    }
    public void buildAudi(){
        Audi.build();
    }
    public void repairBMW(){
        BMW.repair();
    }
    public void buildBMW(){
        BMW.build();
    }
    public void repairVolkswagen(){
        Volkswagen.repair();
    }
    public void buildVolkswagen(){
        Volkswagen.build();
    }
}
