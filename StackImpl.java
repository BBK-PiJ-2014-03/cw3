/**
*
*   StackImpl class is an implementation of the AbstractStack class
*
*
*/

public class StackImpl extends AbstractStack {
    
    /**
    *
    *   Constructor calls the superclass constructor with an empty ArrayList
    *
    */
    public StackImpl () {
        super(new ArrayList());
    }
   
   /**
   *
   *    isEmpty() method calls the isEmpty() method of the 
   *    internalList field in the superclass
   *
   *    @return boolean value of whether the underlying data structure of the Stack is empty
   *
   */
   @Override
    public boolean isEmpty() {
        if (super.internalList.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
   
   /**
   *
   *    size() calls the superclass' internalList size() method
   *    to return the size of the underlying data structure of the Stack
   *
   *    @return int value representing the size
   *
   */
   @Override
    public int size() {
        return super.internalList.size();
    }
   
   /**
   *
   *    push() method puts a new ReturnObjectImpl on top of the stack
   *
   *    @param Object item to be stored in the ReturnObject wrapper class
   *
   */
   @Override
    public void push(Object item) {
        internalList.add(new ReturnObjectImpl(item));
    }
   
   /**
   *
   *    top() creates a deep copy of the ReturnObject at the top of the stack and returns it
   *
   *    @return deep copy of the Stack's top element
   *
   */
   @Override
    public ReturnObject top() {
        return new ReturnObjectImpl(internalList.get(internalList.size()-1).getReturnValue());
    }
   
   /**
   *
   *    pop() method removes the object from the top of the stack
   *
   *    @return the ReturnObject from the top of the Stack
   *
   */
   @Override
    public ReturnObject pop() {
        return internalList.remove(internalList.size()-1);
    }
}