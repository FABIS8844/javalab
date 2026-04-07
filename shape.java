 class area {
  3      void area(double radius) {
  4          double result = 3.14 * radius*radius;
  5          System.out.println("area of the circle: "+result);
  6      }
  7      void area(double length ,double breadth) {
  8          double result = length *breadth;
  9          System.out.println("area of the rectangle: "+result);
 10
 11      }
 12      void area(float base, float height) {
 13          float result = 0.5f *base *height;
 14          System.out.println("area of triangle: " +result);
 15      }
 16      public static void main(String args[]) {
 17             area obj =new area();
 18         obj.area(5.0);
 19         obj.area(4.0,6.0);
 20         obj.area(3f,4f);
 21      }
 22 }
 23
~
~
