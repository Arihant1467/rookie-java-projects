import java.util.*;
class GenDemo{
 static void main(String args[]){
 ArrayList<Number> al=null;
 ArrayList<Integer> al1=null;
 ArrayList<Object> al2=null;
 m1(al);
 
 m2(al);
 m2(al1);
 
 m3(al);
 m3(al2);

 m4(al);
 m4(al1); 
 m4(al2); 
 }
 static void m1(ArrayList<Number> al){
 al.add(123);
 }
 static void m2(ArrayList<? extends Number> al){
 // al.add(123);
 }
 static void m3(ArrayList<? super Number> al){
 al.add(123);
 }
 static void m4(ArrayList<?> al){
// al.add(123);
 }
}