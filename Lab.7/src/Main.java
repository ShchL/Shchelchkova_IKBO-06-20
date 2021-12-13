public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(10, 5, 2, 4);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(10, 5, 2, 4, 5);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}