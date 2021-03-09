package com.example.demo.study7;

public class Main {

    public static void main(String[] args) {
        Fruit fruit_type = Fruit.Orange;

        switch(fruit_type) {
            case Orange:
                System.out.println("おいしいみかん");
                break;
            case Apple:
                System.out.println("りんごたべたい");
                break;
            case Melon:
                System.out.println("メロンがすべて");
                break;
        }
    }

    protected enum Fruit {
        Orange,
        Apple,
        Melon
    };

}
