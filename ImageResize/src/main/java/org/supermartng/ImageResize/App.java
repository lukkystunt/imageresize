package org.supermartng.ImageResize;

import java.io.*;

/**
 * An Image Resizer Class
 * Helps resizing an image based on the dimension specified
 * it also maintains the aspect ratio of the original image
 * 
 * Depends On Imgscalr library
 */
public class App 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String path = null;
		int dimension  = 100;
		
		try
		{
			System.out.print("Enter the image path: ");
				
			path = br.readLine();
			
			if(new File(path).isFile())
			{
				System.out.print("Enter the image dimension width or height: ");
				
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
				dimension = Integer.parseInt(br1.readLine());
				
				ImageResizer.res(path, dimension);
			}
			else
			{
				System.out.println("Image Does Not Exist");
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
