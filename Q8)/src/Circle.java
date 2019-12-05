import java.lang.Math;
public class Circle {

float radius;

//constructor
    Circle(float radius){
    this.radius = radius;
    }
//Functions
    float area(){
    return ((float) (Math.PI *Math.pow(radius,2)));
    }

}
