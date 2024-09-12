public class CircularQueueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int size) {
            arr = new int[size];
            this.size = size;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty() {
            return front==-1&&rear==-1;
        }
        public static boolean isFull() {
            return (rear+1)%size==front;
        }

        //add
        public static void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear+1)%size;
            }
            arr[rear] = data;
        }

        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(front == rear) {
                front = rear = -1;
            } else {
                front = (front+1)%size;
            }
            return result;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}