abstract public class Vehicle {
        int yearOfManufacture;

        Vehicle() {
            yearOfManufacture = 0;
        }

        abstract int getData();

        abstract void putData(int x);
}
