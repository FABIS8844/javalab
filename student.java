 import java.util.Scanner;
  2 class Student {
  3     int rollno;
  4     String name;
  5     int mark1,mark2;
  6     Student(int r,String n,int m1,int m2){
  7         rollno = r;
  8         name = n;
  9         mark1 = m1;
 10         mark2 = m2;
 11     }
 12      void display() {
 13          System.out.println("roll no: " +rollno);
 14          System.out.println("name : " +name);
 15          System.out.println("subject 1  mark : " +mark1);
 16          System.out.println("subject 2 mark : " +mark2);
 17          System.out.println();
 18      }
 19 }
 20 class Main {
 21     public static void main (String[] args) {
 22             Student s1 = new Student (1,"arshan",70,88);
 23             Student s2 = new Student (2,"fabis",75,85);
 24             Student s3 = new Student (3,"ameen",90,88);
 25         s1.display();
 26         s2.display();
 27         s3.display();
 28     double avgsub1 = (s1.mark1 + s2.mark1 +s3.mark1) / 3.0;
 29     double avgsub2 = (s1.mark2 + s2.mark2 +s3.mark2) / 3.0;
 30
 31     System.out.println("avg of subject 1: " +  avgsub1);
 32     System.out.println("avg of subject 2: " + avgsub2);
 33     }
 34 }
 35
 36
 37
 38
