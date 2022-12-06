package org.homeworks.hw01;

public class Runer {
    public static void main(String[] args) {
        Worker mishka = new Worker();
        mishka.setName("Мишка");

        Worker zelya = new Worker();
        mishka.setName("Зеля");

        zelya.goodsIn();
        mishka.goodsBreak();

    }
}
