public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("violet", 20);
        System.out.println(b1.toString());

        Ball b2 = new Ball("yellow");
        System.out.println(b2.toString());

        Ball b3 = new Ball();
        System.out.println(b3.toString());

        Ball b4 = new Ball();
        try {
            b4.setColour("green");
            b4.setRadius(15);
        } catch (Exception exception){
            System.out.println(exception);
            System.exit(0);
        }
        System.out.println(b4.toString());

        Ball b5 = new Ball();
        try {
            b5.setColour("");
            b5.setRadius(0);
        } catch (Exception exception){
            System.out.println(exception);
            System.exit(0);
        }
        System.out.println(b5.toString());
    }
}
