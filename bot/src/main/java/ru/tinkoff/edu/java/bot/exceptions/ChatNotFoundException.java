package ru.tinkoff.edu.java.bot.exceptions;

public class ChatNotFoundException extends RuntimeException{
    public ChatNotFoundException(String message) {
        super(message);
    }
}
