import entities.Content;
import utils.ExtractorContent;
import utils.JsonParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LanguagesExtractor implements ExtractorContent {

    public List<Content> extractContents(String json) {

        JsonParser parser = new JsonParser();
        List<Map<String, String>> attributesList = parser.parse(json);

        List<Content> contents = new ArrayList<>();

        for (Map<String, String> attributes : attributesList) {

            String title = attributes.get("title");
            String imageUrl = attributes.get("image");
            Content content = new Content(title, imageUrl);

            contents.add(content);

        }

        return contents;

    }
    
}
