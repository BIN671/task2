package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Strings str = new Strings();
        str.add("23fdddf");
        str.add("23fdfgfgddf");
        str.add("23fgfgdddf");
        str.add("23fddfgfgggfggffdf");
        System.out.println(str.max());
        System.out.println(str.avg());
    }
}

