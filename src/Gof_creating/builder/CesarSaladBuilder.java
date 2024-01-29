package Gof_creating.builder;

public class CesarSaladBuilder extends SaladBuilder {
    @Override
    void buildVegetables() {
        salad.setVegetables("Tomato");
    }

    @Override
    void buildFruits() {
        salad.setFruits("Pineaple");
    }

    @Override
    void buildMeat() {
        salad.setMeat("Chicken");
    }

    @Override
    void buildSauce() {
        salad.setSauce(Sauce.MUSTARD);
    }
}
