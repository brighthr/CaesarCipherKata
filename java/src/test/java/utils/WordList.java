package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WordList {

    public static List<String> load() throws IOException {
        URL url = WordList.class.getResource("/wordlist.txt");
        BufferedReader abc = new BufferedReader(new FileReader(url.getPath()));
        List<String> lines = new ArrayList<>();

        String line;
        while((line = abc.readLine()) != null) {
            lines.add(line);
        }
        abc.close();

        return lines;
    }
}
