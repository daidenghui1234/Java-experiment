package 五;

class Lader {
    double above,bottom,height;
    public double getArea() {
       double area = (above+bottom)*height/2.0;
       return area;
    }
    public void setAbove(double a) {
      above = a;
    }
   public void setBottom(double b) {
      bottom = b;
   }
   public void setHeight(double c) {
     height = c;
   }
}