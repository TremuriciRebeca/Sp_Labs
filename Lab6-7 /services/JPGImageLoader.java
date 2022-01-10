package services;

import services.ImageLoader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPGImageLoader implements ImageLoader {

    private String url;
    private BufferedImage loadedImage= null;

    public JPGImageLoader(String imageUrl)
    {
        this.url = imageUrl;
    }

    @Override
    public BufferedImage load() throws IOException {

        if(loadedImage == null) {
            loadedImage = ImageIO.read(new File(url));
        }
        return loadedImage;
    }
}
