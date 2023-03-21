import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 타겟 디렉터리를 기준으로 순회하는 클래스
 * 
 * @author yblee
 * @since 2023.03.20
 * 
 */
public class DirectroyListPrint {
    // 타켓 디렉터리의 하위 디렉터리/파일 이름을 담는 리스트
    private static List<String> dirList = new ArrayList<String>();

    /**
     * 타켓 디렉터리를 기준으로 순회하는 메서드
     * 
     * @author yblee
     * @since 2023.03.20
     * 
     */
    public List<String> printFile(File f) throws Exception{
        // 파일 배열에 받아온 파일의 목록을 담아준다.
        File[] files = f.listFiles();
        // 더 이상 순회할 디렉터리/파일이 없다면
        if (!f.exists()) {
            throw new FileNotFoundException("경로가 없습니다.");
        } else {
            for (File file : files) {
                // 디렉터리내의 하위 디렉터리/파일 정보를 저장하기 위한 스트링 버퍼
                StringBuffer fileNameStrBuf = new StringBuffer();
                // 디렉터리라면
                if (file.isDirectory()) {
                    // 버퍼에 디렉터리+디렉터리 이름의 문자열을 추가한다.
                    fileNameStrBuf.append("Directory " + file.getName());
                    // 디렉터리의 하위 디렉터리/파일을 순회하기 위해 메서드 호출
                    printFile(file);
                    // 파일이라면
                } else {
                    // 버퍼에 파일 이름의 문자열을 추가한다.
                    fileNameStrBuf.append(file.getName());
                }
                // 버퍼에 저장되었던 디렉터리/파일 목록을 추가한다.
                dirList.add(fileNameStrBuf.toString());
            }
        }
        return dirList;
    }

}
