public class QueueImple {
    int size = 10;
    int q[] = new int[size];
    int currSize = 0;
    int start = -1, end = -1;

    void push(int x) {
        if (currSize == size) {
            System.out.println("Queue overFlow ");
            return;
        }
        if (currSize == 0) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % size;
        }
        q[end] = x;
        currSize += 1;
    }

    int pop() {
        if (currSize == 0) {
            System.out.println("Queue is empty ");
            return -1; // Return a default value or throw an exception
        }
        int ele = q[start];
        if (currSize == 1) {
            start = end = -1;
        } else {
            start = (start + 1) % size;
            currSize -= 1;
        }
        return ele;
    }

    int top() {
        if (currSize == 0) {
            System.out.println("Queue is empty ");
            return -1; // Return a default value or throw an exception
        }
        return q[start];
    }

    int size() {
        return currSize;
    }

    public static void main(String[] args) {
        QueueImple q = new QueueImple();
        q.push(3);
        q.push(2);
        q.push(4);
        System.out.println("The top of the queue before deleting any element " + q.top());
        q.pop();
        q.pop();
        q.push(42);
        q.push(36);
        q.pop();
        System.out.println("The top  of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}