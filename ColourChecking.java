import java.awt.Color;

public class ColourChecking {
    public static void main(String[] args) {
        // Define RGB values for the color
        int red = 193;
        int green = 255;
        int blue = 183;

        // Create a Color object with the RGB values
        Color color = new Color(red, green, blue);

        // Get the HSB values of the color
        float[] hsb = Color.RGBtoHSB(red, green, blue, null);

        // Extract HSB values
        float hue = hsb[0];          // Hue
        float saturation = hsb[1];    // Saturation
        float brightness = hsb[2];    // Brightness

        // Print the HSB values
        System.out.println("Hue: " + hue);
        System.out.println("Saturation: " + saturation);
        System.out.println("Brightness: " + brightness);
    }
}
