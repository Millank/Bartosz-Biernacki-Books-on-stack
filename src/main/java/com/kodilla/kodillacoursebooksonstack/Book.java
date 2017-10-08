package com.kodilla.kodillacoursebooksonstack;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;


/**
 * Created by Bartosz Biernacki.
 */
public class Book {

    String title;
    String author;
    int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString(){
        return " " + title + ", author: " + author + ", (" + year + ")";
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}

class OrdersQueueExample
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Book theBookOne = new Book("\"Inferno\"", " Dan Brown ", 2013);
        Book theBookTwo = new Book(" \"Mały książe\"", " Antoine de Saint-Exupéry ", 1943);
        Book theBookThree = new Book(" \"Kuchnia Polska\"", " Andrzej Frukacz", 2003);
        Book theBookFour = new Book(" \"Człowiek wśród ludzi\"", " Bogdan Wojciszke", 2002);
        Book theBookFife = new Book(" \"Wywieranie wpływu na ludzi\"", " Robert B. Caldini", 2004);


        ArrayDeque<Book> theBooks = new ArrayDeque<Book>();

        System.out.println( "Queue is created. It's size: " + theBooks.size() );

        theBooks.offer(theBookOne);
        theBooks.offer(theBookTwo);
        theBooks.offer(theBookThree);
        theBooks.offer(theBookFour);
        theBooks.offer(theBookFife);


        System.out.println( "Queue is filled. It's size: "  + theBooks.size() );

        Book temporaryBook;
        temporaryBook = theBooks.poll();
        temporaryBook = theBooks.poll();
        temporaryBook = theBooks.poll();
        temporaryBook = theBooks.poll();
        temporaryBook = theBooks.poll();


        System.out.println( "Queue is emptied. It's size: " + theBooks.size() );
        System.out.println();
        System.out.println("Last book removed from the stack:" + temporaryBook );

    }
}

