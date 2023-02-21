package com.example.ootpisp;

public class Insect extends Animal{
    private int amountOfLimbs;
    public Insect(int amountOfLimbs, Person owner, int age, String species, boolean isAutotrophic){
        super(owner, age, species, isAutotrophic);
        this.amountOfLimbs = amountOfLimbs;
    }
}
