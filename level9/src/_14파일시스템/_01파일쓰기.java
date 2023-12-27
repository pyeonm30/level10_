package _14파일시스템;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// java.io.file 
// java.nio.file 
public class _01파일쓰기 {
	public static void main(String[] args) {
		
		String path = "\\src\\" + _01파일쓰기.class.getPackageName();
		Path rootPath = Paths.get("").toAbsolutePath(); // 현재 프로젝트의 절대경로
		System.out.println(path);
		System.out.println(rootPath);
		
		Path curPath = Paths.get(rootPath + path);
		System.out.println(curPath);
		
		Path txtPath = Paths.get(curPath.toString(),"\\test.txt");
		//System.out.println(txtPath);
		
		try {
			Files.createFile(txtPath);
		} catch (IOException e) {
			System.out.println("파일 이미 있습니다");
		}

		System.out.println(Files.exists(txtPath));
		
		try {
			Files.createDirectory(
					Paths.get(curPath.toString(), "myFloder")
				);
			System.out.println("폴더 만들었음 ");
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
		Charset charset = StandardCharsets.UTF_8;
		
		String data ="안녕하세요";
		
		try {
			Files.write(txtPath, data.getBytes(charset));
			System.out.println("파일 읽기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
