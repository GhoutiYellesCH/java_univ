package exo4;

public class Window {
    private boolean isopen;

    public Window() {
        this.isopen = true;
    }

    public void closeWindow() {
        this.isopen = false;
        System.out.println("Window is closed");
    }

    public void isOpen() {
        System.out.println("Window open status: " + isopen);
    }
}
