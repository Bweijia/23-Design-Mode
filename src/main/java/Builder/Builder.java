package main.java.Builder;

/**
 * create BWJ
 */
public abstract class Builder {

    //第一步：装CPU
    public abstract void  BuildCPU();

    //第二步：装主板
    public abstract void BuildMainboard();

    public abstract void BuildHD();

    public abstract Computer GetComputer();

}
