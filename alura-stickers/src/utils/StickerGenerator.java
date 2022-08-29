package utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Font;

public class StickerGenerator {

    public void create(InputStream inputStream, String fileName) throws IOException {

        BufferedImage originalImage = ImageIO.read(inputStream);

        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        int newHeight = height + 200;
        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);
 
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(originalImage, 0, 0, null);

        Font source = new Font(Font.SANS_SERIF, Font.BOLD, 50);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(source);

        String phrase = "TOPZERA";
        int phraseWidth = graphics.getFontMetrics().stringWidth(phrase);
        int textPosition = (newImage.getWidth() - phraseWidth) / 2;
        graphics.drawString(phrase, textPosition, newHeight - 80);
        
        ImageIO.write(newImage, "png", new File("stickers/", fileName));
    
    }
    
}
