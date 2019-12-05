public class Sector extends Circle{
    float angle;
    Sector(float radius,float angle){
        super(radius);
        this.angle = angle;
    }
    float area_sector(){
        return ((float) Math.pow(radius,2)*angle/2);
    }
}
