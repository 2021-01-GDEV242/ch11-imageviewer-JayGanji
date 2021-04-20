import java.awt.Color;
/**
 * An image filter to make items that have a high 
 * red value for the pixel data appear as white.
 * 
 * @author Jayaditya Ganji.
 * @version 1.0
 */
public class RedChannelFilter extends Filter
{
	/**
	 * Constructor for objects of class LighterFilter.
     * @param name The name of the filter.
	 */
	public RedChannelFilter(String name)
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
                int brightness = pixel.getRed();
                if (brightness <= 180){
                    Color newColor = new Color(0, pixel.getGreen(), pixel.getBlue());
                    image.setPixel(x, y, newColor);
                }
            }
        }
    }

}