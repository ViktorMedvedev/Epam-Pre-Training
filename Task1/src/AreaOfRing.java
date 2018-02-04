public class AreaOfRing {
    public static double countCircleArea(double radius){
        return Math.PI*radius*radius;
    }
    public static double countAreaOfRing(double radius1, double radius2){
        return Math.abs(countCircleArea(radius1) - countCircleArea(radius2));
    }
    public static void run(){
        double r1 = 5;
        double r2 = 7;
        System.out.println("The area of ring is  " + countAreaOfRing(r1, r2));
    }
}
