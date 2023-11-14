package org.example;


import com.google.gson.Gson;

 class Main {
    public static void main(String[] args) {
        String name = "Polina";
        String lastName = "Linska";

        Person person = new Person(name, lastName);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
