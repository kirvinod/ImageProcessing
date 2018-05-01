import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class WritePixel {

    public static void main(String[] args) {

        File file = null;
        BufferedImage img = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);

        int a = (int)(Math.random()*256); //alpha
        int r = (int)(Math.random()*256); //red
        int g = (int)(Math.random()*256); //green
        int b = (int)(Math.random()*256); //blue

        int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel

        img.setRGB(0,0, p);

        try {
            file = new File("src/images/output/write_pixel.jpg");
            ImageIO.write(img, "jpg", file);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
