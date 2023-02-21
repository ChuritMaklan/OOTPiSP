package com.example.ootpisp;

abstract public class Animal extends LivingCreature{
    protected Person owner;
    public Animal(Person owner, int age, String species, boolean isAutotrophic){
        super(age, species, isAutotrophic);
        this.owner = owner;
    }
}
