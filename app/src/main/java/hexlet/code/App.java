package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
        mixinStandardHelpOptions = true,
        name = "gendiff",
        description = "Compares two configuration files and shows a difference."
)
public class App implements Runnable {
//    @Option(names = {"-h", "--help"}, description = "Show this help message and exit.")
//
//    @Option(names = {"-V", "--version"}, description = "Print version information and exit.")
//    String version;


    public static void main(String[] args) {
        new CommandLine(new App()).execute(args);
    }
    @Override
    public void run() {
        System.out.println("Hello World!");
    }

}
