package com.example.ootpisp;

public class Plant extends LivingCreature{
    private int floweringPeriod;
    private boolean isEatable;
    public Plant(int floweringPeriod, boolean isEatable, int age, String species, boolean isAutotrophic){
        super(age, species, isAutotrophic);
        this.floweringPeriod = floweringPeriod;
        this.isEatable = isEatable;
    }
}
