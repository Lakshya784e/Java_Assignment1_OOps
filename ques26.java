class Queue{
    int arr[];
    int front;
    int rear;
    public Queue(){
arr = new int[1001];
front = -1;
rear = -1;
    }
    public void add(int r){
        if(front== -1){
            front++;
        }
        rear++;
        arr[rear] = r;
       
        }
        public int remove(){
            if(front==-1){
                return -1;
            }
            int m = arr[front];
            front++;
return m;
        }
        public int peek(){
            if(front==-1){
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            if(front==-1 || front>rear){
                return true;
            }
            return false;
        }
}
public class ques26 {
    public static void main(String[] args) {
        System.out.println();
        Queue q = new Queue();
        q.add(12);
        q.add(17);
        q.add(15);
        while(!q.isEmpty()){
       System.out.println(q.remove());
        }
    }
}
