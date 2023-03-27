public class StopWatch {
    private double startTime, stopTime;
    public  StopWatch(){
    }
    public void start(){
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        stopTime=System.currentTimeMillis();
    }
    public double getTime(){
        return (stopTime-startTime);
    }

}

