package com.example.ootpisp;

public class Fish extends Animal{
    private int preferredWaterTemperature;
    private int preferredWaterSaltiness;
    public Fish(int preferredWaterTemperature, int preferredWaterSaltiness, Person owner, int age, String species, boolean isAutotrophic){
        super(owner, age, species, isAutotrophic);
        this.preferredWaterTemperature = preferredWaterTemperature;
        this.preferredWaterSaltiness = preferredWaterSaltiness;
    }
}
