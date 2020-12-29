package Model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class XmlParser {

    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Staff[] staff = xmlMapper.readValue(new File("src/main/resources/FileToParse.xml"), Staff[].class);
        ObjectMapper objectMapper = new ObjectMapper();
        File afterParseFile = new File("src/main/resources/afterParse.json");
                objectMapper.writeValue(afterParseFile,staff);

    }
}
