/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulitithreadapp;

/**
 *
 * @author HP
 */
public class Simplethread extends Thread {
@Override
public void run() {
System.out.println(Thread.currentThread().getId() + " is executingthe thread.");
}
public static void main(String[] args) {
    Simplethread thread1 = new Simplethread();
Simplethread thread2 = new Simplethread();
thread1.start(); // Starts thread1
thread2.start(); // Starts thread2
    
}
}
