import java.awt.Color;
/**
 * An image filter to give a green tint.
 * 
 * @author Jayaditya Ganji.
 * @version 1.0
 */
public class GreenTintFilter extends Filter
{
	/**
	 * Constructor for objects of class LighterFilter.
     * @param name The name of the filter.
	 */
	public GreenTintFilter(String name)
    {
        super(name);
	}

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                int brightness = pixel.getGreen();
                Color newColor = new Color(pixel.getRed(), (int)(pixel.getGreen()+(255-brightness)*0.5), pixel.getBlue());
                image.setPixel(x, y, newColor);
            }
        }
    }

}