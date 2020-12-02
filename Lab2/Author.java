package ru.mirea.gibo4.Lab2;

import java.lang.*;
public class Author {
    private String author;
    private String name;
    private char gender;
    public Author(String s, char c, String s1) {
        author = "George R. R. Martin";
        name = "A Song of Ice and Fire";
        gender = 'M';
    }
    public Author(char g) {
        author = "J. K. Rowling";
        name = "Harry Potter";
        gender = g;
    }
    public Author(char g, String n) {
        author = "The apostles and disciples";
        name = n;
        gender = g;
    }
    public String getAuthor() { return author; }
    public char getGender() { return gender; }
    public String getName() { return name; }
}

