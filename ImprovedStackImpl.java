/**
*
*   Implementation of ImprovedStack
*
*/

public class ImprovedStackImpl implements ImprovedStack {

    private AbstractStack stack;
    
    public ImprovedStackImpl (AbstractStack stack) {
        this.stack = stack;
    }
    
    /**
    *
    *   reverse() method returns a new Improved stack with all the elements reversed
    *
    *   @return an ImprovedStack with reversed elements
    *
    */
    @Override
    public ImprovedStack reverse() {
        ArrayList newArray = new ArrayList();
        
        int count = stack.internalList.size() - 1;
        for (int i = 0; i < stack.internalList.size()-1; i++) {
            newArray.add(stack.internalList.get(count));
            count--;
        }
        ImprovedStack test = new ImprovedStackImpl(new StackImpl());
        for (int i = 0; i < newArray.size()-1; i++) {
            test.push(newArray.get(i).getReturnValue());
        }
        return test;
    }
    
    /**
    *
    *   remove method loops through the internalList held by stack
    *   uses .equals() to compare each element to the object parameter
    *   if they are equivalent then the internalList.remove() method is called
    *   with the index number of the for loop counter
    *
    *   @param object to be searched for and removed
    *
    */
    @Override
    public void remove(Object object) {
        for (int i = 0; i < stack.internalList.size()-1; i++) {
            if (stack.internalList.get(i).getReturnValue().equals(object)) {
                stack.internalList.remove(i);
            }
        }
    }
    
    
    /**
    *
    *   calls the pop method of the stack field
    *
    *   @return the ReturnObject popped from stack
    *
    */
    @Override
    public ReturnObject pop() {
        return stack.pop();
    }
    
    /**
    *
    *   calls the top method of the stack field
    *
    *   @return the ReturnObject from the top of stack
    *
    */
    @Override
    public ReturnObject top() {
        return stack.top();
    }
    
    /**
    *
    *   calls the push method of the stack field
    *
    *   @param the Object pushed to stack
    *
    */
    @Override
    public void push(Object item) {
        stack.push(item);
    }
    
    /**
    *
    *   calls the size method of the stack field
    *
    *   @return the size of the stack
    *
    */
    @Override
    public int size() {
        return stack.size();
    }
    
    /**
    *
    *   calls the isEmpty method of the stack field
    *
    *   @return the boolean value of whether or not the stack is empty
    *
    */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}