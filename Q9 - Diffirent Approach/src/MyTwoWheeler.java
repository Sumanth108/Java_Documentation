class MyTwoWheeler extends TwoWheeler {

    MyTwoWheeler() {

    }

    void putData(int x) {
        super.putData(x); // super refers to TwoWheeler class and its putData is called.
    }
}