package fr.eni.ecole.surpriselivestock.application;

import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.surpriselivestock.bo.Chicken;
import fr.eni.ecole.surpriselivestock.bo.Dragon;
import fr.eni.ecole.surpriselivestock.bo.Egg;

public class Hatching {
    public static void main(String[] args) {
        Chicken rousette = new Chicken();
        Dragon toothless = new Dragon();

        Egg egg01 = new Egg(rousette);
        Egg egg02 = new Egg(toothless);

        System.out.println("1st hatching!");
        egg01.hatch();

        System.out.println("2nd hatching!");
        egg02.hatch();

        List<Egg> basket = new ArrayList<Egg>() {{
            add(egg01);
            add(egg02);
        }};

        System.out.println("The foreach:");
        basket.forEach(egg -> egg.hatch());
    }
}
