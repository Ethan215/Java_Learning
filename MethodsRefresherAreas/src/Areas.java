public class Areas {
    /**
     * This Method returns the area of a circle with radius as parameters
     * @param radius
     * @return Math.PI * Math.pow(radius,2);
     */
    public double areaOfCircle(double radius){

        return Math.PI * Math.pow(radius,2);
    }

    /**
     * This Method returns the area of a Square with side as parameters
     * @param side
     * @return Math.pos(side,2)
     */
    public double areaOfSquare(double side){
        return Math.pow(side,2);
    }

    /**
     * This Method returns the area of a Triangle with height and base as parameters
     * @param height
     * @param base
     * @return (heigh * base) / 2
     */
    public double areaOfTriangle(double height, double base){
        return  (height * base) / 2;
    }

    /**
     * This Method returns the area of a Rectangel with length and width as parameters
     * @param length
     * @param width
     * @return return length * width
     */
    public double areaOfRectangel(double length, double width){
        return length * width;
    }

    /**
     * This Method returns the area of a Trapezoid with height,upBase and downBase width as parameters
     * @param height
     * @param upBase
     * @param downBase
     * @return ((upBase+downBase) * height ) / 2
     */
    public double areaOfTrapezoid(double height, double upBase, double downBase ){
        return ((upBase+downBase) * height ) / 2;
    }

}
