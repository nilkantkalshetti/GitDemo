package BasicJavaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingTxt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		int lineCount = 0;
		int charCount = 0;
		int wordCount = 0;

		try {
			reader = new BufferedReader(
					new FileReader("D:\\Nilkant\\Study\\SeleniumLearning\\TestFiles\\JavaSampleTest.txt"));
			String currentLine = reader.readLine();
			System.out.println(currentLine);

			while (currentLine != null) {
				// Updating the lineCount
				lineCount++;
				// Getting number of words in currentLine
				String[] words = currentLine.split(" ");
				// Updating the wordCount
				wordCount = wordCount + words.length;
				// Iterating each word
				for (String word : words) {
					// Updating the charCount
					charCount = charCount + word.length();
				}
				// Reading next line into currentLine
				currentLine = reader.readLine();
			}
			System.out.println("Number Of Chars In A File : " + charCount);
			System.out.println("Number Of Words In A File : " + wordCount);
			System.out.println("Number Of Lines In A File : " + lineCount);
		} finally {
			try {
				reader.close(); // Closing the reader
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
