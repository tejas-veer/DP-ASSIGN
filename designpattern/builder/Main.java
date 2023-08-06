package net.media.training.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Person personn1 = new PersonBuilder().addId(1).addCity("Thane").addName("Ram").addCountry("India").build();
        persons.add(personn1);

        Person personn2 = new PersonBuilder().addId(2).addCity("Mumbai").addName("Rahim").addCountry("India").build();
        persons.add(personn2);
        
        Person personn3 = new PersonBuilder().addId(3).addCity("Delhi").addName("Rahul").addCountry("India").build();
        persons.add(personn3);

        String XmlData =  PeopleDataSource.getPeopleXml(persons);
        System.out.println(XmlData);
    }
}
