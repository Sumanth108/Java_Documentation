final class FourWheeler extends Vehicle { // Final implies the class cannot be extended
    FourWheeler() {

    }

    int getData() {
        return yearOfManufacture;
    }

    void putData(int x) {
        yearOfManufacture = x;
    }
}