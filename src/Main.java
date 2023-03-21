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
     * 
     */
    public static void main(String[] args) throws Exception {
        List<String> dir = new ArrayList<>();
        DirectroyListPrint targetDir = new DirectroyListPrint();
        try {
            File f = new File("/home/ubin/Documents/Test/");
            dir = targetDir.printFile(f);
            System.out.println(dir);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
