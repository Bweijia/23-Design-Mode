package main.java.Builder;

/**
 * create BWJ
 */
public class TestBuilder {
    public static void main(String[] args) {
      //创建构建者
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.Construct(builder);

        Computer computer = builder.GetComputer();
        computer.Show();

    }
}
