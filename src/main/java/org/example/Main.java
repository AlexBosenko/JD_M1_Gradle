package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Bosenko");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}