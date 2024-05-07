package rensyu6_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("コピー元のデータ.txt");
		FileOutputStream fos = new FileOutputStream("コピーされたデータ.txt", true);
		int i = fis.read();
		while (i != -1) {
			char c = (char)i;
			fos.write(c);
			i = fis.read();
		}
		System.out.println("ファイルをコピーしました");
		fos.flush();
		fis.close();
		fos.close();
	}
}
