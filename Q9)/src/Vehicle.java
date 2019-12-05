public abstract class Vehicle {
    int year_of_manufacture;
    Vehicle()
    {
        getData();
        putData();
    }
    abstract void getData();
    abstract void putData();

}
