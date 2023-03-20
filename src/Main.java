import java.io.File;
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
    public static void main(String[] args) {
        List<String> dir = new ArrayList<>();
        DirectroyListPrint targetDir = new DirectroyListPrint();
        try {
            File f = new File("/home/ubin/Documents/Test");
            dir = targetDir.printFile(f);
            System.out.println(dir);
        } catch (NullPointerException e) {
            System.out.println("경로가 존재하지 않습니다.");
        }
    }
}
