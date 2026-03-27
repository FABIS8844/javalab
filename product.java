1 import java.util.Scanner;
  2 class Product {
  3     int pcode;
  4     String pname;
  5     double price;
  6  Product(int c,String n,double p){
  7         pcode = c;
  8         pname = n;
  9         price = p;
 10 }
 11     static void findLowest(Product p1,Product p2,Product p3) {
 12         Product min = p1;
 13         if (p2.price < min.price) min = p2;
 14
 15         if (p3.price < min.price) min = p3;
 16         System.out.println("Lowest price product: ");
 17         System.out.println(min.pname + "-" +min.price);
 18     }
 19 public static void main(String[] args) {
 20         Product p1 = new Product(1,"pen",20);
 21         Product p2 = new Product(2,"Book",50);
 22         Product p3 = new Product(3,"pencil",10);
 23         findLowest(p1, p2, p3);
 24     }
 25 }
 26
 27
~
~
~
