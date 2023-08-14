public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){}

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String speedS = "";
        switch (this.speed){
            case SLOW:  speedS = "Slow";
                break;
            case MEDIUM:  speedS = "Medium";
                break;
            case FAST:  speedS = "Fast";
                break;
        }
        if (this.on){
            return "Fan is on {" +
                    "on = " + on +
                    ", speed = " + speed + " (" + speedS +
                    "), radius = " + radius +
                    ", color = '" + color + '\'' +
                    '}';
        } else {
            return "Fan is off {" +
                    "on = " + on +
                    ", radius = " + radius +
                    ", color = '" + color + '\'' +
                    '}';
        }
    }
}
