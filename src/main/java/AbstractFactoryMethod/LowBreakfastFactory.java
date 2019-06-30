package main.java.AbstractFactoryMethod;

/**
 * create BWJ
 */
public class LowBreakfastFactory implements BreakfastFactory {
    @Override
    public Breakfast sellBuns() {
        return new CheckBuns();
    }

    @Override
    public Breakfast sellSoyMilk() {
        return new CheckSoyMilk();
    }
}
