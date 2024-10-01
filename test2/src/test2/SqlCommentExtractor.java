package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class SqlCommentExtractor {
public static void main(String[] args) throws Exception {
// 이 변수에 sql 파일 위치 폴더를 기록
String dirStr = "C:\\Users\\tj\\AppData\\Roaming\\DBeaverData\\workspace6\\General\\Scripts";

File dir = new File(dirStr);
Arrays.asList(dir.listFiles()).stream().filter(s -> s.getName().endsWith(".sql")).forEach(f -> {
String[] names = f.getName().split("\\.");
String sqlFileDest = names[0] + "-result." + names[1];
System.out.println(sqlFileDest);
try {
BufferedReader br = new BufferedReader(new FileReader(f));
BufferedWriter bw = new BufferedWriter(new FileWriter(new File(dir, sqlFileDest)));
String s = null;
while ((s = br.readLine()) != null) {
if (s.startsWith("--")) {
bw.write(s);
bw.newLine();
}
}
br.close();
bw.close();
} catch (Exception e) {
e.printStackTrace();
}
});
}
}