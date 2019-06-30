package main.java.AbstractFactoryMethod;

/**
 * create BWJ
 */
public class TestAbstractFactory {
    public static void main(String[] args) {


        AdvBreakfastFactory advBreakfastFactory = new AdvBreakfastFactory();
        Breakfast breakfast = advBreakfastFactory.sellBuns();
        breakfast.sell();

        LowBreakfastFactory lowBreakfastFactory = new LowBreakfastFactory();
        Breakfast breakfast1 = lowBreakfastFactory.sellSoyMilk();
        breakfast1.sell();
    }
}
