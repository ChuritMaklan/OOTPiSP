package com.example.ootpisp;

public class Bird extends Animal{
    private String featherColour;
    private boolean canFly;
    public Bird(String featherColour, boolean canFly, Person owner, int age, String species, boolean isAutotrophic){
        super(owner, age, species, isAutotrophic);
        this.featherColour = featherColour;
        this.canFly = canFly;
    }
}
