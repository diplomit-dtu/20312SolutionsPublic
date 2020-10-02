package opg06_01_Punkter;

import java.util.Objects;

public class AutoPoint {
    private int x;
    private int y;

    public AutoPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }





    public String toString() {
        return "AutoPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutoPoint)) return false;
        AutoPoint autoPoint = (AutoPoint) o;
        return x == autoPoint.x &&
                y == autoPoint.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

