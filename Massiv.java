import java.util.Arrays;
public class Massiv {
public static void main (String args[]) {
int [] Massiv =new int [100];
int k=200;
int n=0;
for (int i = 0; i < 100; i++) {
  Massiv[i]= (int) (Math.random ()*k);	
int d=Massiv[i]%3;
if (d==0) {
n=n+1;
}
}
System.out.println (n);
}}


