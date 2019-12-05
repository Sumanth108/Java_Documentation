public class Segment extends Circle {
    float length;

    Segment(float radius, float lenght){
        super(radius);
        this.length = lenght;
    }

    double area_segment(){
        return (double) Math.pow(radius,2)* Math.pow(((radius-length)/radius)-((radius-length) * (2*radius*length-Math.pow(length,2))),1/2);
    }
}
