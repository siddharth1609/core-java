package java8.fileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileSample {

	public static void main(String[] args) throws IOException {

		// We need to provide file path as the parameter:
		// double backquote is to avoid compiler interpret words
		// like \test as \t (ie. as a escape sequence)
		File file = new File("E:\\sid.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);

	}

}
