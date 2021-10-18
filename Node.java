package linkedlist;

/**
 * @author Rashaad Washington
 * CSCI 3250
 * Assignment 2
 */
public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;
    
    //----------------------------------------
    public T getData()
    {
        return data;
    }
    public void setData(T data){
         this.data=data;
    }
    //----------------------------------------
    public Node<T> getNext()
    {
        return next;
    }
    public void  setNext(Node<T> next){
        this.next= next;
    }
    //----------------------------------------
    public Node<T> getPrev()
    {
        return prev;
    }
    public void setPrev(Node<T> prev){
        this.prev = prev;
    }
    //-----------------------------------------
    public Node(T value)
    {
        data = value;
    }
    
    public Node(T value, Node<T> nextNode)
    {
        data = value;
        next = nextNode;
    }
    
    public Node(T value, Node<T> nextNode, Node<T> prevNode)
    {
        data = value;
        next = nextNode;
        prev = prevNode;
    }
}
