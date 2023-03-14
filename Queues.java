package Stacks_Queues;

public class Queues {

    int Max;
    char[] queue;
    int tail;

    public Queues(int Max) {
        this.Max = Max;
        queue = new char[Max];
        tail = 0;
    }


    public char agrgegar(char[] cola, char item) {
        if (tail == Max) {
            System.out.println("esta lleno el queue");
        }else{
            queue[tail] = item;
            tail++;
        }
        return (0);
    }

    public char delete() {
        if (tail == 0) {
            return ('#');
        } else {
            char item = queue[0];
            for (int i = 0; i < tail - 1; i++) {
                queue[i] = queue[i + 1];
            }
            tail--;
            return (item);
        }
    }

}
