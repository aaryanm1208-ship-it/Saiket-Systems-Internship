import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("📄 File Analysis Result:");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
            return;
        }

        System.out.print("\nEnter a word to search: ");
        String searchWord = sc.nextLine().toLowerCase();
        int occurrences = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (word.equals(searchWord)) {
                        occurrences++;
                    }
                }
            }

            System.out.println("🔍 The word '" + searchWord + "' occurred " + occurrences + " times.");

        } catch (IOException e) {
            System.out.println("❌ Error reading file during search: " + e.getMessage());
        }

        sc.close();
    }
}
