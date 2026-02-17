class MyQueue {
  int maxsize = 20;
  int[] queuek;
  int front=-1,rear=-1;
  public MyQueue() {
      queuek = new int[maxsize];
  }
  public void push(int x) {
      if(front == -1){
          front++;
      }
      queuek[++rear]= x;
  }
  
  public int pop() {
      return queuek[front++];
  }
  
  public int peek() {
      return queuek[front];
  }
  
  public boolean empty() {
      if(front == -1){
          return true;
      }
      if(queuek[front] == 0 ){
          return true;
      }
      return false;
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