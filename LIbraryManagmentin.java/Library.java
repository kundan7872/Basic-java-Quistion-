/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ritesh Singh
 */
public class Library {
    private Set<Book> bookset;
    public Library(){
    bookset=new HashSet<>();
}
    public boolean addBook(Book b){
        return bookset.add(b);
    }
    public int getBookCount(){
        return bookset.size();
    }
    public Set<Book> getAllBooks(){
        return bookset;
    }
}
