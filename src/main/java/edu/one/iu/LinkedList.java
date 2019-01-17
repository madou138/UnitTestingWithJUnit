package edu.one.iu;
import java.util.*;

public class LinkedList<T> implements ILinkedList<T>
{
    ILinkedList<T> next;
    T element;

    public int size()
    {
        return 0;
    }

    /**
     * Get the next list element
     * @return the next element
     */
    public ILinkedList<T> next()
    {
        return this.next;
    }

    /**
     * Gets the last element in the list
     * @return the node at the end of the list
     */
    public ILinkedList<T> last()
    {
        ILinkedList temp;
        temp = this;
        while(((LinkedList) temp).next!= null) {
            temp = ((LinkedList) temp).next;
        }
        return temp;
    }

    /**
     * Get the element n elements down the list
     * @param n the number of elements to skip
     * @return the element n away
     */
    public ILinkedList<T> after(int n)
    {
        ILinkedList temp = next;
        int count = 0;
        temp = this;
        while(temp != null){
            if(count == n){
                return temp;
            }
            count++;
            temp = ((LinkedList) temp).next;
        }
        return temp;
    }

    /**
     * Removes the next element (sets null)
     * @return the previously next element
     */
    public ILinkedList<T> detach()
    {
        ILinkedList temp;
        temp = this;
        this.next = null;
        return this;
    }

    /**
     * Gets the current value
     * @return the current value
     */
    public T get()
    {
        ILinkedList<T> current;
        current = this;
        return ((LinkedList<T>) current).element;
    }

    /**
     * Sets the value of this node
     * @param value the new value
     */
    public void set(T value)
    {
        ILinkedList temp;
        temp = this;
        if(((LinkedList) temp).element == null){
            ((LinkedList) temp).element = value;
            System.out.println(value);
        }
    }

    /**
     * Sets the next element in the list
     * @param next the next element
     *
     * Example: (1->2->3).setNext(4) => 1->4
     */
    public void setNext(ILinkedList<T> next)
    {
        ILinkedList temp;
        temp = this;
        while (((LinkedList) temp).next == null){
            ((LinkedList) temp).element = next;
        }

    }

    /**
     * Sets the next element after this current element
     * @param next the next element
     *
     * Example: (1->2->3).appnd(4) => 1->2->3->4
     */
    public void append(ILinkedList<T> next)
    {
        ILinkedList temp;
        temp = last();
        temp.setNext(next);
    }

    /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
     *
     * Example: (1->2->3).insert(4) => 4->1->2->3
     */
    public void insert(ILinkedList<T> newFirst)
    {
        newFirst.setNext(this);
        System.out.println(newFirst);
    }
}
