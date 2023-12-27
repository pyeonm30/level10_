package _14파일시스템;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class _03인풋스트림 {

	public static void inputStr4(Path path) {
		long startTime = System.nanoTime();
		// BufferedInputStream 내부 버퍼 용량 : 8192바이트 
		// 버퍼에 남은 용량을 유동적으로 받아옴 
		try(
				FileInputStream fis = new FileInputStream(path.toString());
				BufferedInputStream bis = new BufferedInputStream(fis)){
			
			Charset charset = StandardCharsets.UTF_8;
			// 버퍼 인풋 스트림에서  byte[1024] 씩 가져오는것 
			byte[] buffer = new byte[1024];
			int readByte =0;
			int count =0;
			
			while((readByte = bis.read(buffer)) != -1) {
				String data = new String(buffer, 0, readByte,charset);
				System.out.printf("\n------- %d : %d ----- \n%n", ++count, readByte);
				System.out.println(data);
			}
			long endTime = System.nanoTime();
			System.out.println("%n % d 나노초".formatted(endTime- startTime));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 파일에서 바로 byte[1024] 씩 가져오는것 
	public static void inputStr3(Path path) {
		long startTime = System.nanoTime();
		Charset charset = StandardCharsets.UTF_8;
		byte[] buffer = new byte[1024]; // 바이트를 1024개씩 한꺼번에 담아온다
		// 마지막에는 메모리방 누수 발생 : 304 없는데 1024 용량으로 만들어서 가져옴 
		// 빈공간은 0 채운다 
		try(FileInputStream fis = new FileInputStream(path.toString());
			){
			int readByte =0;
			int count =0; 
			while((readByte = fis.read(buffer)) != -1) {
				String data = new String(buffer, 0, readByte,charset);
				System.out.printf("\n------- %d : %d ----- \n%n", ++count, readByte);
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		
		System.out.println("%n % d 나노초".formatted(endTime- startTime));
		
	}
	
	
	public static void inputStr2(Path path) {
		long startTime = System.nanoTime();
		Charset charset = StandardCharsets.UTF_8;
		//InputStreamReader	바이트 스트림을 문자열 스트림으로 변경시켜주는 애 
		try(FileInputStream fis = new FileInputStream(path.toString());
			 InputStreamReader	isr = new InputStreamReader(fis , charset)
				){
			int readByte =0;
			while((readByte = isr.read()) != -1) {
				char data =(char) readByte;
				System.out.print(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		
		System.out.println("%n % d 나노초".formatted(endTime- startTime));
		
	}
	
	public static void inputStr1(Path path) {
		// fileInputStream -> inputStream 상속받은 것 : byte 
		// 파일에서 1바이트씩 꺼내옴 : 비효율적이다 
		try(FileInputStream fis = new FileInputStream(path.toString())){
			int readByte =0;
			while((readByte = fis.read()) != -1) {
				char data =(char) readByte;
				System.out.print(data);
			}
		}catch(IOException e) {
			
		}
	}
	
	public static void main(String[] args) {

		String path ="src\\_14파일시스템";
		String fileName="beatles.txt";
		Path txtPath = Paths.get(path,fileName);
		System.out.println(Files.exists(txtPath));
		inputStr3(txtPath);
		inputStr4(txtPath);
		
	}

}
