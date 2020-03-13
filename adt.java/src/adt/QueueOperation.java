package adt;

import java.util.Scanner;

public class QueueOperation {
    int data;
    int front , rear ,capacity;
    int size=0;
    int[] queue;
    Scanner sc2 =new Scanner(System.in);
    public QueueOperation(int c){
      data = 0;
      front= rear=0;
      capacity=c;
      queue = new int[capacity];
    }
    public void enqueue(){
        System.out.println("Enter the element to be inserted:");
        data=sc2.nextInt();
        if(rear==capacity){
            System.out.println("queue is overflow");
        }
        else{
            queue[rear]=data;
            System.out.println(queue[rear]+" is inserted");
            size++;
            rear++;
        }
    }
    public void dequeue(){
        if(queue[front]==0){
            System.out.println("queue is underflow");
        }
        else{
            queue[front]=0;
            System.out.println("done");
            front++;
            size--;
        }
    }
    public void view(){
        System.out.println("length is:"+queue.length);
        System.out.print("Elements Are: ");
        for(int i=0; i<queue.length;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();

    }
    public void rear(){
        if(queue.length==0){
            System.out.println(rear);
        }
   else{

            System.out.println(queue[size-1]);
        }
    }
    public void front(){
        if(queue.length==0){
            System.out.println(front);
        }
        else{
            System.out.println(queue[front]);
        }
    }
    public void size(){
        System.out.println("size is: "+ size);
    }
}

