

public class Fan {
    private int speed;
    private boolean on = false;
    private double radius;
    private String color;
    private final String s="SLOW";
    private final String m="MEDIUM";
    private final String f="FAST";

    public Fan() {
    }
public Fan ( int speed ,boolean on,double radius, String color ){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color= color;
}
    public boolean setOn() {
       return this.on;
    }

    public String getSpeed() {
        if(speed==1){
            return s;
        }else if(speed==2){
            return m;
        }else{ return f;}
    }
    public  String getColor(){
        return this.color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String toString(){
        if(setOn()){
            return "speed: " + getSpeed()+ "\t" +"radius: "+ getRadius()+"\t"+"color: " + getColor() + " fan is on ";
        }else{ return "speed: " + getSpeed()+ "\t" +"radius: "+ getRadius()+"\t"+"color: " + getColor() + " fan is off ";}
    }
}



