package com.example.ootpisp;

public class Mushroom extends LivingCreature{
    private boolean isPoisonous;
    public Mushroom(boolean isPoisonous, int age, String species, boolean isAutotrophic){
        super(age, species, isAutotrophic);
        this.isPoisonous = isPoisonous;
    }
}
