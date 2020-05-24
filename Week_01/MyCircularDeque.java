class MyCircularDeque {
    private int[] circularDeque;
    private int size=0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        circularDeque = new int[k]; 
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        for(int i=size;i>0;i--){
            circularDeque[i]=circularDeque[i-1];
        }
        circularDeque[0]=value;
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        circularDeque[size]=value;
        size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }else{
            for(int i=0;i<size-1;i++){
                circularDeque[i]=circularDeque[i+1];
            }
            circularDeque[size-1]=0;
            size--;
            return true;
        }
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }else{
            circularDeque[size-1]=0;
            size--;
            return true;
        }
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty()){
            return -1;
        }else{
            return circularDeque[0];
        }
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty()){
            return -1;
        }else{
            return circularDeque[size-1];
        }
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(circularDeque.length==size){
            return true;
        }else{
            return false;
        }
    }
}