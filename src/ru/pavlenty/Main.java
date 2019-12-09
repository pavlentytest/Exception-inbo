package ru.pavlenty;

public class Main {

    public static void main(String[] args) {
    	try {
			int a = 100;
			int b = 0;
			//int c = a / b;
			int[] d = {3,4,5};
			int bb = d[10];
		} catch(ArithmeticException|ArrayIndexOutOfBoundsException a) {
			System.out.println("Арифм. Ошибка: ");
		} catch (Exception e) {
			 System.out.println("Ошибка: " + e.toString());
		 }
		finally {
    		System.out.println("Всегда!!!");
		}
	    System.out.println("Что-то после....");
    }
}
