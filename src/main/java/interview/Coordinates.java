package interview;

/**
 * You have to develop a function which you can receive two instructions for position x and y:
 * move forward: you move forward 1 position.
 * turn right: you only turn right but don't move forward.
 * <p/>
 * Then you need to return the last position for the x and y.
 * <p/>
 * If I receive turnRight and moveForward, which one should i do first ?
 * R: move forward
 */
public class Coordinates {

    private int x = 0;
    private int y = 0;

    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean left = false;

    public void move(boolean moveForward, boolean turnRight) {

        if (moveForward) {
            if (right) {
                x = x + 1;
            }

            if (left) {
                x = x - 1;
            }

            if (up) {
                y = y + 1;
            }

            if (down) {
                y = y - 1;
            }
        }

        if (turnRight) {
            if (right) {
               right = false;
               down = true;
            } else if (left) {
                left = false;
                up = true;
            } else if (up) {
                up = false;
                right = true;
            } else if (down) {
                down = false;
                left = true;
            }

        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
