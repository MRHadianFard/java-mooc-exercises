/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String name, int pages, int year) {
        this.title = name;
        this.pages = pages;
        this.year = year;
    }
    
    public String getName() {
        return this.title;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
