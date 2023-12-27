package _14파일시스템;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class _02파일읽기 {

	public static void main(String[] args) {

		//String path = "src\\" +_02파일읽기.class.getPackageName();
		Path txtPath = Paths.get("src\\_14파일시스템" , "test.txt");
		System.out.println(Files.exists(txtPath));
		
		List<String> lines = Arrays.asList(
                "아기상어 뚜루루뚜루", "귀여운 뚜루루뚜루",
                "바다속 뚜루루뚜루",  "아기상어",
                "",
                "엄마상어 뚜루루뚜루", "어여쁜 뚜루루뚜루",
                "바다속 뚜루루뚜루",  "엄마상어"
        );
		
		try {
			Files.write(txtPath, lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		byte[] path4Bytes=new byte[1];
        // 대용량 파일 경우 부적합
		try {
			path4Bytes = Files.readAllBytes(txtPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String result = new String(path4Bytes);
		System.out.println(result);
		
		System.out.println(txtPath.getParent().toString());
		
		// 파일 복사 
		Path copied = Paths.get(
				txtPath.getParent().toString(),"moved.txt"
				);
		
		try {
			Files.copy(txtPath, copied);
			System.out.println("복사완료");
		} catch (IOException e) {
		}
		
		// 파일 이동 
		Path moved = Paths.get(txtPath.getParent().getParent().toString(), "moved.txt");
		
		try {
			Files.move(copied, moved);
			System.out.println("이동완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 파일 삭제 
		
		try {
			Files.delete(moved);
			System.out.println("삭제완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
