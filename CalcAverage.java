import java.util.Scanner; //импорт класса
public class CalcAverage {
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter 3 numbers");
int i1 = sc.nextInt();
int i2 = sc.nextInt();
int i3 = sc.nextInt();
int av=(i1+i2+i3)/3;
int m1=Math.max (i1,i2);
int m2=Math.max (m1,i3);
System.out.println("averege " + av);
System.out.println("maximum " + m2);

}}


