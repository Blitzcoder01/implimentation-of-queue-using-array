package input;

import adt.QueueOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class input {
    public void interact(){
        Scanner sc =new Scanner(System.in);
            System.out.println("input capacity of queue");
            int c = sc.nextInt();
            // variable c to store capacity
            QueueOperation obj = new QueueOperation(c);
        try {
            while (true) {
                System.out.println(" * press " + 2 + " for insert elements in queue");
                System.out.println(" * press " + 3 + " for remove elements from queue");
                System.out.println(" * press " + 4 + " for view the queue");
                System.out.println(" * press " + 5 + " for show front of queue");
                System.out.println(" * press " + 6 + " to show rear of queue");
                System.out.println(" * press " + 7 + " to print size of queue");
                System.out.println(" * press " + 8 + " to quit");
                int input_choice = sc.nextInt(); //variable to store the choice
                if (input_choice == 2) {
                    obj.enqueue(); // calling enqueue() function
                } else if (input_choice == 3) {
                    obj.dequeue();//calling of dequeue() function
                } else if (input_choice == 4) {
                    obj.view(); //calling of view() function
                } else if (input_choice == 5) {
                    obj.front();// calling of front() function
                } else if (input_choice == 6) {
                    obj.rear();//calling of rear() function
                }
                else if (input_choice == 7) {
                    obj.size();//calling of size() function
                }
                else if (input_choice == 8) {
                   System.out.println("successfully exit..");
                   break;
                }

            }

        }
        catch (InputMismatchException e){
            System.out.println("wrong input...");
        }
        sc.close();
    }

    }

