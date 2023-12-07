package fr.eni.ecole.surpriselivestock.bo;

public class Egg {
    private LivingBeing adult;

    public Egg(LivingBeing adult) {
        this.setAdult(adult);
    }

    private void setAdult(LivingBeing adult) {
        this.adult = adult;
    }

    public void hatch() {
        System.out.println(this.adult.firstCry());
    }
}
