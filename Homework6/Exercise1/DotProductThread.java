package Homework6.Exercise1;

public class DotProductThread extends Thread {
    private int[] v1;
    private int[] v2;
    private int dot;
    public DotProductThread(int[] v1, int[] v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public void run() {
        if(v1.length == v2.length) {
            for(int i = 0; i < v1.length; i++) {
                dot += v1[i] * v2[i];
            }
        }
    }

    public int getDot() {
        return dot;
    }

    public void setDot(int dot) {
        this.dot = dot;
    }
}
