/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3strukdat2;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alan
 */
public class latihan2 {
    public void queueExample() {
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("Dotnet");
        queue.offer("PHP");
        queue.offer("HTML");

        System.out.println("remove : " + queue.remove());
        System.out.println("element : " + queue.element());
        System.out.println("poll : " + queue.poll());
        System.out.println("peek : " + queue.peek());
    }

}
