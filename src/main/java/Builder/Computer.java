package main.java.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * create BWJ
 */
public class Computer {
    private String cpu;
    private String mainBoard;
    private String hd;

    public String getCpu() {
        return cpu;
    }

    public Computer setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public Computer setHd(String hd) {
        this.hd = hd;
        return this;
    }

    public Computer setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
        return this;
    }

    //电脑组件的集合
    private List<String> parts = new ArrayList<String>();

    //用于将组件组装到电脑里
    public void Add(String part) {
        parts.add(part);
    }

    public void Show() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.println("组件" + parts.get(i) + "装好了");
        }
        System.out.println("电脑组装完成，请验收");


    }
}
