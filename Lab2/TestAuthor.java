package ru.mirea.gibo4.Lab2;

import java.lang.*;
public class TestAuthor {
    public static void  main(String[] args) {
        Author k1 = new Author("George R. R. Martin",'M', "A Song of Ice and Fire");
        System.out.println(" Author " + k1.getAuthor() + " Gender "+ k1.getGender()
                + " Name is " + k1.getName());
        Author k2 = new Author('F');
        System.out.println(" Author " + k2.getAuthor() + " Gender " + k2.getGender()
                + " Name is " + k2.getName());

        Author k3 = new Author('U',"Bible");
        System.out.println(" Author " + k3.getAuthor() + " Gender " + k3.getGender()
                + " Name is " + k3.getName());
    }
}

