public interface Stack {
    /**
    *
    * @return true if the stack is empty, otherwise returns false.
    */
    public boolean isEmpty();
    /**
    * Post-condition: If insertion is successful, item is on the top of the
    * stack.
    *
    * @param item
    * is the new item to be added
    * @return A ReturnObject containing an appropriate error if the insertion
    * is not successful, otherwise the item that was "pushed"
    */
    public ReturnObject push(Object item);
    /**
    * Post-condition: the stack is left unchanged.
    *
    * @return If stack is not empty, the item on the top is returned. If the
    * stack is empty, an appropriate error.
    */
    public ReturnObject top();
    /**
    * If stack is not empty, the item on the top is removed from the stack.
    *
    * @return the item from the top of the stack If the stack is empty, an
    * appropriate error.
    */
    public ReturnObject pop();
}