package com.example.ootpisp;

abstract public class LivingCreature {
    protected int age;
    protected String species;
    protected boolean isAutotrophic;
    public LivingCreature(int age, String species, boolean isAutotrophic){
        this.age = age;
        this.isAutotrophic = isAutotrophic;
        this.species = species;
    }
}
