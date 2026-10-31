package exo4;

public class Main {
    public static void main(String[] args) {
        Window myWindow = new Window();
        Mouse myMouse = new Mouse();
        myWindow.isOpen();
        System.out.println("Simulating mouse click at (50, 50)...");
        myMouse.mouseClick(myWindow, 50, 50);
        myWindow.isOpen();
    }
}
