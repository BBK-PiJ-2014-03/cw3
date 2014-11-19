public class LinkedList implements List {
   
    private ReturnObjectImpl item;
   
    public LinkedList next;
    public LinkedList prev;
   
    private int index;
   
    private static int size = 0;
   
   
    public LinkedList () {
        this.item = null;
        this.prev = null;
        this.next = null;
    }

    public LinkedList (Object item) {
        this.item = new ReturnObjectImpl(item);
        this.prev = null;
        this.next = null;
    }
   
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        else {
            return false;
        }
    }
   
    public int size () {
        return size;
    }
   
   
    public ReturnObject get(int index) {
        ReturnObject result;
        if (this.size() == 0) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (index < 0 || index >= size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        else {
            if (this.next.index == index) {
                result = new ReturnObjectImpl(this.next.item.getReturnValue());
            }
            else {
                return this.next.get(index+1);
            }
        return result;
        }
    }
   
    public ReturnObject remove (int index) {
        ReturnObject result;
        if (index >= this.size() || index < 0) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        else {
            if (this.next.index == index) {
                result = new ReturnObjectImpl(this.next.item.getReturnValue());
                this.next = this.next.next;
                this.next.prev = this;
                this.next.increaseIndex(index);
                size--;
                
            }
            else {
                return this.next.remove(index+1);
            }
        }
        return result;
    }
   
   
    public ReturnObject add (Object item) {
        ReturnObject result;
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        else {
            if (this.next == null) {
                this.next = new LinkedList(new ReturnObjectImpl(item));
                this.next.index = this.index+1;
                this.next.prev = this;
                size++;
                return new ReturnObjectImpl(item);
            }
            else {
                return this.next.add(item);
            }
        }
    }
   
   
   
    public ReturnObject add (int index, Object item) {
        ReturnObject result;
        if (index < 0 || index >= this.size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        else {
            if (next.index == index) {
                LinkedList newNode = new LinkedList(new ReturnObjectImpl(item));
                this.next.prev = newNode;
                this.next = newNode;
                newNode.prev = this;
                newNode.next = this.next;
                this.next.increaseIndex(index);
                size++;
                result = new ReturnObjectImpl(null);
            }
            else {
                return next.add(index, item);
            }
        }
        return result;
    }
    
    private void increaseIndex(int index) {
        this.index = index;
        if (this.next == null) {
            return;
        }
        else {
            next.increaseIndex(index+1);
        }
    }
   
    public int getIndex() {
        return index;
    }
}