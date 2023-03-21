import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * (non-javadoc)
     * 
     * @author yblee
     * @since 2023.03.20
     */
    public static void main(String[] args) throws Exception {
        List<String> fileNames = new ArrayList<>();
        DirectroyListPrint directoryListPrint = new DirectroyListPrint();
        try {
            File targetDirectory = new File("/home/ubin/Documents/Test/");
            fileNames = directoryListPrint.printFile(targetDirectory);
            System.out.println(fileNames);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
