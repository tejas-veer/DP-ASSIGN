package net.media.training.designpattern.builder;

public class PersonBuilder {
    private String name;
    private int id;
    private String city;
    private String country;

    public PersonBuilder(){};

    public PersonBuilder addId(int id){
        this.id = id;
        return this;
    }

    public PersonBuilder addName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder addCity(String city){
        this.city = city;
        return this;
    }

    public PersonBuilder addCountry(String country){
        this.country = country;
        return this;
    }

    public Person build(){
        Person person = new Person(name, id, city, country);
        return person;
    } 
}