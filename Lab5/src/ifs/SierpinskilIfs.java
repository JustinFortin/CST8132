package ifs;

/**The purpose of this class is to assign all the required values for an Affine Transform
 * @author Justin Warkus-Fortin
 * @version 1.0
 * @since 1.8
 */

public class SierpinskilIfs extends AffineTransform {

	private double scale = -500;
	private int height = 449, width = 519, xOffset= 439, yOffset = 509;
	private double [][] affine = new double[][] { {0.50, 0.00, 0.00, 0.50, 0.00, 0.00, 0.33},
												  {0.50, 0.00, 0.00, 0.50, 0.00, 0.50, 0.33},
												  {0.50, 0.00, 0.00, 0.50, 0.43, 0.25, 0.34} };
			
	
	public String getName() {
		return "Sierpinski Gasket";
	}
	public double[][] getAffine() {
		return this.affine;
	}
													
	public double getScale() {
		return this.scale;
	}
													
	public int getHeight() {
		return this.height;
	}
													
	public int getWidth() {
		return this.width;
	}
												
	public int getxOffset() {
		return this.xOffset;
	}
													
	public int getyOffset() {
		return this.yOffset;
	}
}
