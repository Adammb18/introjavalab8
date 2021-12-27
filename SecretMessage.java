import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.StringTokenizer;

public class SecretMessage{

public static void main(String[] args) throws IOException {
    FileReader file = new FileReader("C:/Users/bisso/OneDrive/Desktop/Javaprojects/lab8/secret.txt");
    @SuppressWarnings("resource")
    BufferedReader input = new BufferedReader(file);
    StringTokenizer tokenizer;
    String fileContents;
    String wordToken;
    int count = 0;
    char letter;

    StringBuffer strbuff = new StringBuffer();

    while ((fileContents = input.readLine()) != null) {
        tokenizer = new StringTokenizer(fileContents);
    while (tokenizer.hasMoreTokens()) {
        wordToken = tokenizer.nextToken();
    if (count % 5 == 0) {
        letter = wordToken.charAt(0);
        strbuff.append(Character.toUpperCase(letter));
    }
count++;

}
}
System.out.println(strbuff);
}
}
