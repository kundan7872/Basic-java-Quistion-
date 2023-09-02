/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Objects;

/**
 *
 * @author Ritesh Singh
 */
public class Book {

   
private String bookName;
    private String bookAuthor;
    private double bookPrice; 
    public Book(String bookName, String bookAuthor, double bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.bookName);
        hash = 19 * hash + Objects.hashCode(this.bookAuthor);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.bookPrice) ^ (Double.doubleToLongBits(this.bookPrice) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (Double.doubleToLongBits(this.bookPrice) != Double.doubleToLongBits(other.bookPrice)) {
            return false;
        }
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.bookAuthor, other.bookAuthor)) {
            return false;
        }
        return true;
    }
     @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice + '}';
    }
    
}
