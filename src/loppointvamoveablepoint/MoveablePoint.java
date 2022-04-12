package loppointvamoveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {

    }
    public MoveablePoint(float xSpeed,float ySpeed,float x,float y) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + super.getX() +
                ", ySpeed=" + super.getY() +
                '}';
    }
    public MoveablePoint move() {
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ySpeed);
        return this;

    }
}
