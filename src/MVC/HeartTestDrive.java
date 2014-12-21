package MVC;

/**
 * Monitoring heart rate.
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModelInterface model = new HeartModel();
        ControllerInterface controller = new HeartController(model);
    }
}
