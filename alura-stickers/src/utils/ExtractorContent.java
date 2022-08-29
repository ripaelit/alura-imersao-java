package utils;

import entities.Content;

import java.util.List;

public interface ExtractorContent {

    public List<Content> extractContents(String json);
    
}
