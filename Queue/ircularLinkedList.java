public class ircularLinkedList {

    public static class queueC {
        int[] arr = new int[5];
        int size = 0;
        int front = -1;
        int raer = -1;

        public void add(int val) {

            if (size == 5) {
                System.out.println("Queue is full");
                return;
            }
            if (size == 0) {
                front = raer = 0;
                arr[0] = val;
            } else if (raer < 5 - 1) {
                arr[++raer] = val;
            } else if (raer == 5 - 1) {
                raer = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else if (front == 5 - 1) {
                int val = arr[front];
                return val;

            } else {
                int val = arr[front];
                front++;
                return val;

            }
        }

        public void display() {
            if (front <= raer) {
                for (int i = front; i <= raer; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

            else {
                for (int i = front; i < 5 - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= raer; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    

    public static void main(String[] args) {
queueC q= new queueC();
q.add(4);
q.add(4);
q.add(4);
q.add(4);
q.display();
    }
}
