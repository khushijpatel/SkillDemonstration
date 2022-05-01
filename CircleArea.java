public class CircleArea{
    private double radius;

    public CircleArea(){
        radius = -1.0;
    }

    public double CircleAreaCalc(double radius){
        if(radius <= 0.0){
            return -1.0;
        }
        this.radius = radius;
        double area = 3.14 * (radius * radius);
        return area;
    }
    
    public String result(){
        String result = Double.toString(CircleAreaCalc(radius));
        return result;
    }
}
