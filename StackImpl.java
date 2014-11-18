public class StackImpl extends AbstractStack {
   
    public StackImpl () {
        super(new ArrayList());
    }
   
    public boolean isEmpty() {
        if (super.internalList.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
   
    public int size() {
        return super.internalList.size();
    }
   
    public void push(Object item) {
        internalList.add(new ReturnObjectImpl(item));
    }
   
   
    public ReturnObject top() {
        return new ReturnObjectImpl(internalList.get(internalList.size()-1).getReturnValue());
    }
   
    public ReturnObject pop() {
        return internalList.remove(internalList.size()-1);
    }
}