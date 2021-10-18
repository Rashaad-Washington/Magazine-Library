package linkedlist;

import linkedlist.exception.ListEmptyException;
import linkedlist.exception.ListException;

/**
 * @author Rashaad Washington
 * CSCI 3250
 * Assignment 2
 */
public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    
    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    public void push_front(T value){
        if (tail == null){
            tail = head;
        } else {
            head = new Node<>(value, head);
        }
        size++;
    }
    
    public void push_back(T value){
        if (head == null){
            head = new Node<>(value);
        } else {
            Node<T> curr = head;
            while (curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(new Node(value));
        }
        size++;
    }
    
    public T pop_back() throws ListEmptyException{
        if (head == null){
            throw new ListEmptyException("Empty List");
        }
        Node<T> curr = head;
        T data = tail.getData();
        tail = curr;
        return data;
    }
    
    public T pop_front() throws ListEmptyException{
        if (head == null){
            throw new ListEmptyException("Empty List");
        }
        T data = head.getData();
        head = head.getNext();
        return data;
    }
    
    public T at(int a) throws ListException{
        if(a < 0 || a >size) {
            throw new ListException("Index out of bounds"); 
        }
        Node<T> curr = head;
        while (a>1)
        {
            curr = curr.getNext();
            a--;
        }
        return curr.getData();
    }
    
    public T front() throws ListEmptyException{
        if (head == null && tail == null){
            throw new ListEmptyException("List is empty");
        }
        return head.getData();
    }
    
    public T back() throws ListEmptyException{
        if (head == null && tail == null){
            throw new ListEmptyException("List is empty");
        }
        return tail.getData();
    }
    
    public void printAll(){
        Node<T> curr=head;
        while(curr!=null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
