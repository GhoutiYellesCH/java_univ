package exo4;

public class Mouse {
    private int Xclose = 50;
    private int Yclose = 50;

    public void mouseClick(Window window, int x, int y) {
        if (x == Xclose && y == Yclose) {
            window.closeWindow();
        } else {
            System.out.println("Coordinates do not match close button: (" + x + ", " + y + ")");
        }
    }
}
