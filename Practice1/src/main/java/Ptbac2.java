public class Ptbac2 {
    private final double a;
    private final double b;
    private final double c;

    public Ptbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getNumberA() {
        return a;
    }
    public double getNumberB(){
        return b;
    }
    public double getNumbetC(){
        return c;
    }
    public double getDelta(){
       return b*b-(4*a*c);

    }
    public double getNgiem1(){
        return  (-b+Math.pow(getDelta(),0.5))/(2*a);
    }
    public double getNgiem2(){
        return  (-b-Math.pow(getDelta(),0.5))/(2*a);
    }

}
