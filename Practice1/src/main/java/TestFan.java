public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true, 10, "yellow");
        String s = fan1.toString();
        System.out.println(s);
        Fan fan2 = new Fan(2,false, 5, "blue");
        String t = fan2.toString();
        System.out.println(t);
    }

}
