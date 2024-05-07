package rensyu6_1;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AnotherMain {
	public static void main(String[] args) throws Exception {
		String inFile = args[0];
		String outFile = args[1];
		inFile = "コピー元のデータ.txt";
		outFile = "コピーされたデータ.txt";
		Files.copy(Paths.get(inFile), Paths.get(outFile));
	}
}
