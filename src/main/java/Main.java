import io.github.noooda.notecli.NoteCli;
import io.github.noooda.notecli.presentation.cli.Controller;;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        NoteCli notecli = new NoteCli(controller);
        notecli.run();
    }
}
