package ki304_Boiko_lab6;

public class Main {
    /**
     *	Method driver
     *	@param args
     */
    public static void main(String[] args) {
        Conveyor <? super Product> conveyor = new Conveyor<>();
        conveyor.putProduct(new Cellphone("Cellphone number 1", 200, true));
        conveyor.putProduct(new AudioPlayer("mp3 player dragon red" , 130, false));
        conveyor.putProduct(new Cellphone("Cellphone3000" , 999, false));
        conveyor.putProduct(new AudioPlayer("King wave cosmos" , 300, false));

        Product product = conveyor.getProduct(0);
        product.print();

        product = conveyor.getProduct(2);
        product.checkIfIsDefect();
        conveyor.checkIfProductIsDefect(2);

        Product min = conveyor.getMin();
        System.out.println("\nThe cheapest product on the conveyor is: ");
        min.print();

        main1(conveyor);
    }

    public static void main1(Conveyor <? super Product> conveyor) {
        int cellphoneCount = 0;
        int audioPlayerCount = 0;

        for (int i = 0; i < conveyor.getSize(); i++) {
            Product product = conveyor.getProduct(i);
            if (product instanceof Cellphone) {
                cellphoneCount++;
            } else if (product instanceof AudioPlayer) {
                audioPlayerCount++;
            }
        }

        System.out.println("\nNumber of cellphones: " + cellphoneCount);
        System.out.println("Number of audioplayers: " + audioPlayerCount);
    }
}
