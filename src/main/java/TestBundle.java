import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Михаил on 23.04.2017.
 */
public class TestBundle {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("go", new Locale("fr","FR"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("bye"));
    }
}
