package myproject;
import java.util.Scanner;
public class time_pass1{
    public static void tower(int n){
    	for (int i=0;i<n;i++) {
    		  for(int j=0; j<n*2;j++) {
    			  System.out.print(" ");
    		  }
	 
	  for(int j=0; j<n-i;j++) {
		  System.out.print(" ");
	  }
	  for(int j=0;j<=i;j++) {
		  System.out.print("* ");
	  }
	  System.out.println();
	  System.out.println();
  }
}
    public static void tower1(int n){
  for (int i=0;i<n;i++) {
	  for(int j=0; j<n-i-1;j++) {
		  System.out.print("  ");
	  }
	  for(int j=0;j<=i;j++) {
		  System.out.print("*  ");
	  }
	  for(int j=0; j<n-i;j++) {
		  System.out.print("  ");
	  }
	  for(int j=0;j<=i;j++) {
		  System.out.print("*  ");
	  }
	  System.out.println();
  }
}
    public static void tower2(int n){
  for (int i=n-1;i>=0;i--) {
	  for(int j=0; j<n-i;j++) {
		  System.out.print("  ");
	  }
	  for(int j=1;j<=i;j++) {
		  System.out.print("*  ");
	  }
	  for(int j=-1; j<n-i;j++) {
		  System.out.print("  ");
	  }
	  for(int j=1;j<=i;j++) {
		  System.out.print("*  ");
	  }
	  System.out.println();
  }
}
    public static void tower3(int n){
    	for (int i=n;i>=0;i--) {
    		 for(int j=0; j<n*2;j++) {
   			  System.out.print(" ");
   		  }
	  for(int j=0; j<n-i;j++) {
		  System.out.print(" ");
	  }
	  for(int j=0;j<=i;j++) {
		  System.out.print("* ");
	  }
	  System.out.println();
	  System.out.println();
  }
}
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Input your number: ");
	int n= sc.nextInt();
tower(n);
tower1(n);
tower2(n);
tower3(n);
}
}