import io.github.noooda.notecli.NoteCli;
import io.github.noooda.notecli.presentation.cli.Controller;
import io.github.noooda.notecli.application.usecases.GetNote;

public class Main {
    public static void main(String[] args) {
        GetNote getNote = new GetNote();
        Controller controller = new Controller(getNote);
        NoteCli notecli = new NoteCli(controller);
        notecli.run();
    }
}
