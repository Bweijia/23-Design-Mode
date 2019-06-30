package main.java.Prototype;

/**
 * create BWJ
 */
public class TestClone {
    public static void main(String[] args) {
        AbstractSpoon spoon = new SoupSpoon();
        AbstractSpoon spoon1= new SaladSpoon();
        Object clone = spoon.clone();
        Object clone1 = spoon1.clone();
        boolean equals = clone.equals(clone1);
        System.out.println(equals);
    }
}
