import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        String url = "http://localhost:8080/languages";
        ExtractorContent extractor = new LanguagesExtractor();

        Client http = new Client();
        String json = http.searchData(url);

        List<Content> contents = extractor.extractContents(json);

        StickerGenerator generator = new StickerGenerator();

        for (int i = 0; i < contents.size(); i++) { 

            Content content = contents.get(i);
        
            InputStream inputStream = new URL(content.getUrlImagem()).openStream();
            String fileName = content.getTitulo().replace(":", "-") + ".png";

            generator.create(inputStream, fileName);

            System.out.println(content.getTitulo());
            System.out.println();

        }

    }
}
