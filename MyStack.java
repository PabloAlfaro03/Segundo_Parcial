package Stacks_Queues;

public class MyStack {
    char [] stack;
    int top;
    int MAX;


    public MyStack(int length) {

    }



        public void push ( char newSize){
            if (top == MAX)
                System.out.println("el stack esta lleno");
            else {
                stack[top] = newSize;
                top++;
            }

        }

        public char pop () {

            this.MAX = stack.length;
            this.top = MAX;

            if (top == 0) {
                System.out.println("El stack esta vacio");
            } else {
                System.out.println(stack[top - 1]);
                stack[top - 1] = ' ';
                top--;
            }
            return ('#');
        }

        public static String invertirCadena (String entrda){
            StringBuilder res;
            char[] arr;
            MyStack stack;

            res = new StringBuilder();
            arr = entrda.toCharArray();
            stack = new MyStack(arr.length);

            for (int i = 0; i < arr.length; i++) {
                stack.push(arr[i]);
                for (i = 0; i < arr.length; i++) res.append(stack.pop());
            }

            return res.toString();
        }
    public static boolean Palindrome(String pal){

        String temporal;

        pal = pal.replace(" ", "");
        temporal = invertirCadena(pal);

        return pal.equals(temporal);
    }




}