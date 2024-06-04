import java.util.Scanner;

public class IroningFacade {
    private Iron iron;
    private PerfumeSprayer perfumeSprayer;
    private Clothes clothes;
    private Scanner scanner;

    public IroningFacade(Iron iron, PerfumeSprayer perfumeSprayer, Clothes clothes) {
        this.iron = iron;
        this.perfumeSprayer = perfumeSprayer;
        this.clothes = clothes;
        this.scanner = new Scanner(System.in);
    }

    public void ironClothes() {
        System.out.println("Get ready to iron clothes...");

        clothes.setOnIroningBoard();

        iron.on();
        System.out.print("Enter the desired ironing temperature: ");
        int temperature = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        iron.setTemperature(temperature);

        System.out.print("Enter the type of perfume to be sprayed: ");
        String perfumeType = scanner.nextLine();
        perfumeSprayer.spray(perfumeType);

        System.out.println("Ironing the clothes...");

        iron.off();
        clothes.removeFromIroningBoard();
    }
}