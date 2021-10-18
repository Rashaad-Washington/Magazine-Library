package library;

import linkedlist.LinkedList;
import linkedlist.exception.ListEmptyException;
import linkedlist.exception.ListException;

/**
 * @author Rashaad Washington
 * CSCI 3250
 * Assignment 2
 */
public class Library {
    private LinkedList<Magazine> magazines;
    
    public Library(){
        magazines = new LinkedList();
    }
    
    public void addMagazine(Magazine m){
        magazines.push_back(m);
    }
    
    public int getCount(){
        return magazines.size();
    }
    
    public Magazine getMagazineWithHighestNumberOfPages() throws ListEmptyException, ListException{
        int count = 1;
        if (magazines.size() == 0){
            throw new ListEmptyException("No magazines");
        } else {
            for (int i = 2; i < magazines.size()+1; i++){
                if (magazines.at(i).getPages() > magazines.at(count).getPages()){
                    count = i;
                }
            }
            return magazines.at(count);
        }
    }
    
    public Magazine get(int i) throws ListException{
        return magazines.at(i);
    }
    
    public int getNumberOfMagazinesHavePagesMoreThan(int pages) throws ListException{
        int count= 1;
        for (int i = 0; i < magazines.size(); i++){
            if (magazines.at(i).getPages() > pages){
                count+=1;
            }
        }
        return count;
    }
    
    public void printAllMagazines(){
        magazines.printAll();
    }
}
