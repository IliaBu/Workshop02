package gb.java_core;
import gb.java_core.IExecutable;

public class MenuItem {

    private final IExecutable executable;
    private final String title;

    public MenuItem(IExecutable executable, String title) {
        this.executable = executable;
        this.title = title;
    }

    public void execute() {
        executable.invoke();
    }

    @Override
    public String toString() {
        return title;
    }
}
