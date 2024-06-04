public class Main {
    public static void main(String[] args) {
        Iron iron = new Iron();
        PerfumeSprayer perfumeSprayer = new PerfumeSprayer();
        Clothes clothes = new Clothes();

        IroningFacade ironingFacade = new IroningFacade(iron, perfumeSprayer, clothes);

        ironingFacade.ironClothes();
    }
}
