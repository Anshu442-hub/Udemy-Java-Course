package com.company;
class Stack {
    private int size;
    private int top=-1;
    private int S[];
    public Stack(int sz) { //constructor
        size=sz;
        S=new int[sz];
    }

    public void push(int x) throws StackOverFlowException {
        if(top==size-1)
            throw new StackOverFlowException();
        top++;
        S[top]=x;
    }

    public int pop() throws StackUnderFlowException {
        int x=-1;
        if(top==-1)
            throw new StackUnderFlowException();
        x=S[top];
        top--;
        return x;
    }
    class StackOverFlowException extends Exception {
        public String toString() {return "Stack is Full";}
    }

    class StackUnderFlowException extends Exception {
        public String toString() {return "Stack is Empty";}
    }
}
public class L177a_StackClass {
    public static void main(String[] args) {
        Stack st=new Stack(5);
        try {
            st.push(10);
            st.push(15);
            st.push(10);
            st.push(15);
            st.push(10);
            st.push(15);

        }
        catch(Stack.StackOverFlowException s) {
            System.out.println(s);
        }
        try{
            st.pop();
        }
        catch(Stack.StackUnderFlowException s) {
            System.out.println(s);
        }

    }
}
