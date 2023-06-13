package Dice;

public class SixSidedDice extends DiceFather {
    public SixSidedDice() {
        super(6);
    }

    /**
     * Metodo di stampa
     */
    @Override
    public int roll() {
        System.out.println("Dice Face: " + getFaceNumbers()); // Stampa il numero di facce del dado
        int result = super.roll(); // Chiamata al metodo roll() della classe padre per ottenere il risultato del lancio
        System.out.println("Dice result: " + result);
        return result;
    }

}
