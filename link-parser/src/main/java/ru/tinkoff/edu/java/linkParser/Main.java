package ru.tinkoff.edu.java.linkParser;

public class Main {
    public static void main(String[] args){
        Pars pars = new Pars();
        System.out.println(pars.parse("https://github.com/sanyarnd/tinkoff-java-course-2022/"));
        System.out.println(pars.parse("https://stackoverflow.com/questions/1642028/what-is-the-operator-in-c"));
        System.out.println(pars.parse("https://stackoverflow.com/search?q=unsupported%20link"));
    }
}
