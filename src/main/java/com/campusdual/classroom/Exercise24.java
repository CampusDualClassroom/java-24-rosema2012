package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {

    public static Queue<String> createQueue() {
        Queue<String> cola1 = new LinkedList<String>();
        cola1.add("Smith");
        cola1.add("Montessori");
        cola1.add("Peralta");
        cola1.add("House");
        return cola1;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while(!queue.isEmpty()){
            System.out.println(queue.peek().toString());
            queue.poll();
        }
    }

    public static void main(String[] args) {
        Queue<String> c = createQueue();
        printAndEmptyQueue(c);

    }

}
