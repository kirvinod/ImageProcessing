
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class ReadPixels {

    public static void main(String args[])throws IOException{
        BufferedImage img = null;
        File f = null;


        try{

            //read image
            f = new File("src/images/img1.jpg");
            img = ImageIO.read(f);

            //get dimensions
            System.out.println(img.getWidth());
            System.out.println(img.getWidth());

            //get pixel value
           //System.out.println(img.getRGB(1,1));


            //get pixel value
            int p = img.getRGB(0,0);

            //get alpha
            int a = (p>>24) & 0xff;

            //get red
            int r = (p>>16) & 0xff;

            //get green
            int g = (p>>8) & 0xff;

            //get blue
            int b = p & 0xff;


            System.out.println(a);
            System.out.println(r);
            System.out.println(g);
            System.out.println(b);



        } catch(IOException e){
            System.out.println(e);
        }

    }


}
