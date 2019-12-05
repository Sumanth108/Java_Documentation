class TwoWheeler extends Vehicle { // Entends the abstract class and defines both abstract methods
    TwoWheeler() {

    }

    int getData() {
        return yearOfManufacture;
    }

    void putData(int x) {
        yearOfManufacture = x;
    }
}