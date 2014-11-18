public class ImprovedStackImpl implements ImprovedStack {

    private AbstractStack stack;
    
    public ImprovedStackImpl (AbstractStack stack) {
        this.stack = stack;
    }
    
    public ImprovedStack reverse() {
        ArrayList newArray = new ArrayList();
        
        int count = stack.internalList.size() - 1;
        for (int i = 0; i < stack.internalList.size(); i++) {
            newArray.add(stack.internalList.get(count));
            count--;
        }
        ImprovedStack test = new ImprovedStackImpl(new StackImpl());
        for (int i = 0; i < newArray.size(); i++) {
            test.push(newArray.get(i).getReturnValue());
        }
        return test;
    }
    
    public void remove(Object object) {
        ArrayList newArray = new ArrayList();
        
        for (int i = 0; i < stack.internalList.size(); i++) {
            if (stack.internalList.get(i).getReturnValue().equals(object)) {
                return;
            }
            else {
                newArray.add(new ReturnObjectImpl(stack.internalList.get(i).getReturnValue()));
            }
        stack.internalList = newArray;
        }
    }
    
    
    
    @Override
    public ReturnObject pop() {
        return stack.pop();
    }
    
    @Override
    public ReturnObject top() {
        return stack.top();
    }
    
    @Override
    public void push(Object item) {
        stack.push(item);
    }
    
    @Override
    public int size() {
        return stack.size();
    }
    
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}