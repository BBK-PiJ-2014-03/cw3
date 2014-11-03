/**
*
* @author PiJ
*
* A simple abstract data type representing a List
*
*/
public interface List {
    /**
    * Post-condition: returns true if the list is empty, otherwise returns
    * false.
    *
    * @return is the list empty
    */
    public boolean isEmpty();
    /**
    * Post-condition: Returns the number of items currently in the list.
    *
    * @return the number of elements in the list
    */
    public int size();
    /**
    * Post-condition: if 1 <= index <= size(), the item at position index is
    * returned Error: "ListIndexOutOfBounds" if index < 1, or index < 1, or
    * index >= size() +1
    *
    * @param index
    * is the position in the list of the item to be retrieved
    * @return the element OR an appropriate error message, encapsulated in a
    * ReturnObject
    */
    public ReturnObject get(int index);
    /**
    * Post-condition: if 1 <= index <= size() + 1, insert the item at position
    * index of the list. If index <= size(), items at position index onwards
    * are shifted one position to the right. Error: Return
    * "ListIndexOutOfBounds" when index < 1 or index > size() + 1. Return
    * "ListIsFull" if the list is full.
    *
    * @param index
    * indicates the position at which the item should be inserted in
    * the list
    * @param item
    * the value to insert into the list
    * @return the item added OR an appropriate error message, encapsulated in a
    * ReturnObject
    */
    public ReturnObject add(int index, Object item);
    /**
    * Post-condition: remove item at position index of a list if 1 <= index <=
    * size(). If index < size(), items at position index onwards are shifted
    * one position to the left. Error: Returns "ListIndexOutOfBounds" when
    * index is out of range. Return "ListIsEmpty" if the list is empty.
    *
    * @param index
    * indicates the position in the list of the item to be removed.
    * @return the item removed OR an appropriate error message, encapsulated in
    * a ReturnObject
    */
    public ReturnObject remove(int index);
}