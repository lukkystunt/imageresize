package org.supermartng.ImageResize;

import static org.imgscalr.Scalr.resize;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//import org.imgscalr.Scalr;
/**
 * An Image Resizer Class
 * Helps resizing an image based on the dimension specified
 * it also maintains the aspect ratio of the original image
 * 
 * Depends On Imgscalr library
 */
public class ImageResizer {

	
	public static void res(String arg, int dimension) throws IOException 
	{
	      File sourceImageFile = new File(arg);
	      BufferedImage img = ImageIO.read(sourceImageFile);
	
	      BufferedImage thumbnail = resize(img, dimension);
	
	      thumbnail.createGraphics().drawImage(thumbnail, 0, 0, null);
	      
	      ImageIO.write(thumbnail, "jpg", new File(System.getProperty("user.dir") +"\\"+ sourceImageFile.getName()));
	      
	      System.out.println("Image Successfully Resized");
	}
}
