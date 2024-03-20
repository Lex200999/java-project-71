package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;

@Command(
        mixinStandardHelpOptions = true,
        name = "gendiff",
        description = "Compares two configuration files and shows a difference."
)
public class App implements Runnable {
    @Parameters(paramLabel = "filepath1", description = "path to first file")
    File filepath1;
    @Parameters(paramLabel = "filepath2", description = "path to second file")
    File filepath2;
    @Option(names = { "-f", "--format" }, paramLabel = "format", description = "output format [default: stylish]")
    File file;

    public static void main(String[] args) {
        new CommandLine(new App()).execute(args);
    }
    @Override
    public void run() {
        System.out.println("Hello World!");
    }

}
