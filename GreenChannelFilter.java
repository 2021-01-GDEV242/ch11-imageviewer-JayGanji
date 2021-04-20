import java.awt.Color;
/**
 * An image filter to make items that have a high 
 * green value for the pixel data appear as white.
 * 
 * @author Jayaditya Ganji.
 * @version 1.0
 */
public class GreenChannelFilter extends Filter
{
	/**
	 * Constructor for objects of class LighterFilter.
     * @param name The name of the filter.
	 */
	public GreenChannelFilter(String name)
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
                if (brightness <= 180){
                    Color newColor = new Color(pixel.getRed(), 0, pixel.getBlue());
                    image.setPixel(x, y, newColor);
                }
            }
        }
    }

}