package lesson5;

import java.io.FileInputStream;

public class Data {

    private String[] header;
    private int[][] data;

    public Data(String[] header, int[][] data) {
        this.header=header;
        this.data=data;
    }

    public String[] addHeader() {
        return header;
    }
    public int[][] addData() {
        return data;
    }

}
