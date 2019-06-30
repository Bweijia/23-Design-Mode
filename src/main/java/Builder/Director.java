package main.java.Builder;

/**
 * create BWJ
 */
public class Director {
    public void Construct(Builder builder){

        builder. BuildCPU();
        builder.BuildMainboard();
        builder. BuildHD();
    }
}
