class MyQueue {
    Stack<Integer> S1,S2;

    public MyQueue() {
        this.S1 = new Stack<>();
        this.S2 = new Stack<>();
    }
    
    public void push(int x) {
        S1.push(x);
        
    }
    
    public int pop() {
        while(!S1.empty()){
            S2.push(S1.pop());
            
            
        }
        int a = S2.pop();
        while(!S2.empty()){
            S1.push(S2.pop());

        }
        return a;
        
    }
    
    public int peek() {
        while(!S1.empty()){
            S2.push(S1.pop());
            
        }
        int b = S2.peek();
        while(!S2.empty()){
        S1.push(S2.pop());
        }
        return b;
        
    }
    
    public boolean empty() {
        return S1.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */