package Model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class JsonFileParseToModel {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File fileToParse = new File("src//main/resources/afterParse.json");
        Scanner scanner = new Scanner(fileToParse);
        StringBuilder stb = new StringBuilder();
        while(scanner.hasNext()){
            stb.append(scanner.nextLine());
        }
        scanner.close();
        List<Staff> staffList = objectMapper.readValue(stb.toString(), new TypeReference<List<Staff>>() {
        });
        System.out.println(staffList.toString());
    }
}
