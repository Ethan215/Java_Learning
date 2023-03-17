public class CalculateAreas {
    public static void main(String[] args){

        Areas area = new Areas();   // creat a a Areas class's variable

        // Initialize variables for the appropriate sides
        double r = 4.3;
        double s = 5.11;
        double th = 3.27, tb = 4.35;
        double len = 5.55, wid = 2.44;
        double trh = 5.2, trup = 2.35, trdw = 4.27;

        // Initialize variables for the 5 areas from the Area class
        double areaCircle = area.areaOfCircle(r);
        double areaSquare  = area.areaOfSquare(s);
        double areaTriangle = area.areaOfTriangle(th,tb);
        double areaRectangle = area.areaOfRectangel(len,wid);
        double areaTrapezoid = area.areaOfTrapezoid(trh,trup, trdw);

        System.out.println("The radius of a circle is " + r + ". The area of a circle is " + areaCircle);
        System.out.println("The side of a square is " + s + ". The area of a square is "+ areaSquare);
        System.out.println("The height of a Triangle is " + th + ". The base of a Triangle is "+tb
                +". The area of a square is "+ areaTriangle);
        System.out.println("The length of a Rectangle is " + len + ". The width of a Rectangle is "+wid
                +". The area of a Rectangle is "+ areaRectangle);
        System.out.println("The height of a Trapezoid is " + trh + ". The Up base of a Trapezoid is "+trup
                + ". The down base of a Trapezoid is "+trdw+". The area of a Trapezoid is "+ areaTrapezoid);

    }
}
