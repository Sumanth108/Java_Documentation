package prog4;

public class ComplexNumber {
    float real;
    float img;
    ComplexNumber(float real,float img){
        this.img = img;
        this.real = real;
    }

    static ComplexNumber addComplex(ComplexNumber c1,ComplexNumber c2){
        return new ComplexNumber(c1.real+c2.real,c1.img+c2.img);
    }

    static ComplexNumber subComplex(ComplexNumber c1,ComplexNumber c2){
        return new ComplexNumber(c1.real-c2.real,c1.img-c2.img);
    }
    static ComplexNumber mulComplex(ComplexNumber c1,ComplexNumber c2){

        // prod = (real*real - img*img) + (real*img + img*real)i
        return new ComplexNumber((c1.real*c2.real)-(c1.img*c2.img),(c1.real*c2.img)+(c1.img*c2.real));
    }
    @Override
    public String toString() {
        return real + "+" + img + "i";
    }
}
