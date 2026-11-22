import java.util.Scanner;

public class Lab2 {

    static class Stackexample {
        int Max = 10;
        int[] stack = new int[Max];
        int top = -1;

        void push(int value) {
            if (top == Max - 1) {
                System.out.println("Stack overflow");
            } else {
                top++;
                stack[top] = value;
                System.out.println(value + " added to the stack");
            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("stack underflow");
            } else {
                System.out.println(stack[top] + " element is removed");
                top--;
            }
        }

        void display() {
            if (top == -1) {
                System.out.println("stack no elements");
            } else {
                System.out.println("Elements in the stack:");
                for (int i = top; i >= 0; i--) {
                    System.out.println(stack[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stackexample obj = new Stackexample();
        int choice;

        do {
            System.out.println("\n1.add");
            System.out.println("2.remove");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter the choice");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the value");
                    int value = sc.nextInt();
                    obj.push(value);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
