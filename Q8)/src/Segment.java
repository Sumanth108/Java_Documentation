public class Segment extends Circle {
    float length;

    Segment(float radius, float length){
        super(radius);
        this.length = length;
    }

    double area_segment(){
        return (double) Math.pow(radius,2)* Math.pow(((radius-length)/radius)-((radius-length) * (2*radius*length-Math.pow(length,2))),1/2);
    }
}
