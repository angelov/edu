package me.angelovdejan.edu.library;

import java.util.UUID;

public class Book {
    public String id() {
        return UUID.randomUUID().toString();
    }
}
