

public class TestStopWatch {
    public static void main(String[] args) {
       double [] ar1 = new double[100000];
        StopWatch w1 =new StopWatch();
            w1.start();
        for (int i = 0; i < ar1.length; i++) {
            ar1[i]=Math.random();
        }
        double max =ar1[0];
        for (int i = 1; i < ar1.length; i++) {
            if( max<ar1[i]){
                max=ar1[i];
            }
        }
        System.out.println(max);
            w1.stop();
        System.out.println("thoi gian da chay la "+ w1.getTime());

    }

}
