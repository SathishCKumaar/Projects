package lemon;
import java.util.Arrays;
import java.util.Scanner;
 public class Array{
	 public static void  main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of thestack");
		int size = sc.nextInt();
		int Queue[]=new int[size];
		int front =-1,rear=-1;
		System.out.println("q operation");
		while(true) {
			
			System.out.println("1.enque2.deque3.disp4.exit");
			
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1: if(rear==size-1) {
				System.out.println("q full");
			}
			else {
				System.out.println("enter the element to insert");
				int key = sc.nextInt();
				rear++;
				Queue[rear]=key;
				front =0;
				
			}
			break;
			
			case 2:
			if((front==-1&&rear==-1)||(front>rear)) {
				
				System.out.println("q empty");
			}
			
			
			else
				front++;
			
			
			break;
			
			case 3:
				if((front==-1&&rear==-1)||(front>rear)) {
					
					System.out.println("q empty");
				}
				
				else
					for(int i=front;i<=rear;i++) {
					System.out.println(Queue[i]);
				}
			break;
			
			case 4:
				System.exit(0);
				
		    default:System.out.println("check the choice");
				break;
		}
		}}}		
		
		
	 
	 