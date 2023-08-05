package servicos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextFileApps {

    public List<String> readTextFile(String file) {

        List<String> gameWordList = new ArrayList<String>();
        
        try {
            String text = Files.readString(Paths.get(file), StandardCharsets.UTF_8); 
            gameWordList = Arrays.asList(text.split(" "));
        } catch(IOException exception) {
            System.out.println("Informe um nome valido para o arquivo!");
        } catch (Exception exception) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
        }

        return gameWordList;
    }

}