import java.awt.Color;
/**
 * An image filter to give a blue tint.
 * 
 * @author Jayaditya Ganji.
 * @version 1.0
 */
public class BlueTintFilter extends Filter
{
	/**
	 * Constructor for objects of class LighterFilter.
     * @param name The name of the filter.
	 */
	public BlueTintFilter(String name)
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
                Color newColor = new Color(pixel.getRed(), pixel.getGreen(), (int)(pixel.getBlue()+(255-brightness)*0.5));
                image.setPixel(x, y, newColor);
            }
        }
    }

}