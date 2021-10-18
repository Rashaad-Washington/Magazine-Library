package library;

import linkedlist.exception.InvalidMagazineException;

/**
 * @author Rashaad Washington
 * CSCI 3250
 * Assignment 2
 */
public class Magazine {
    private String name;
    private int edition;
    private int publishYear;
    private int pages;
    
    public Magazine (String name_, int edition_, int publishYear_, int pages_) throws InvalidMagazineException 
    {
        if("".equals(name_) || edition_ <= 0 || publishYear_ <= 2000 || pages_ <= 0){
           throw new InvalidMagazineException("Invalid Magazine");
        } else {
            name = name_;
            edition = edition_;
            publishYear = publishYear_;
            pages = pages_;
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getEdition()
    {
        return edition;
    }
    
    public int getPublishYear()
    {
        return publishYear;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    @Override
    public String toString(){
        return "\nName: " + name + "\nEdition: " + edition + "\nPublish Year: "+ publishYear+
                "\nPages: " + pages;
    }

}
