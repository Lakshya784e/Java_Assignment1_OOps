
class Stack{
       int arr[];
       int top;
       public Stack(){
        arr = new int[1001];
        top = -1;
       } 
       public void push(int x){
        if(top==1001){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = x;
       
       }
       public int pop(){
if(top==-1){
    return -1;
}
int rx = top;
top--;
return arr[rx];
       }
       public int peek(){
        if(top==-1){
            return -1;
        }
        return arr[top];
       }
       public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
       }

}


public class ques25 {
   
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(6);
s.push(7);
while(!s.isEmpty()){
    System.out.println(s.pop());
}
    }
}
