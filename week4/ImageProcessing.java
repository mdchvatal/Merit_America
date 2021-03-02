package week4;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;


public class ImageProcessing extends GraphicsProgram {
	public void run() {
		GImage image = new GImage("Vermeer_-_The_Milkmaid.jpg");
		GImage reverseImage = new GImage(flipHorizontal(image));
		add(image);
		add(reverseImage, (image.getWidth()), 0);
	}

	int[][] flipHorizontal(GImage image) {
		int[][] tempArray = image.getPixelArray();
		int[][] intArray = image.getPixelArray();
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				tempArray[i][j] = intArray[i][intArray[i].length - (j+1)];
			}
		}
		return tempArray;
	}
}
