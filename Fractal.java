package /*package*/;

import javax.swing.*;
import java.awt.*;

public class Fractal {
    private static double x1, y1;
    private static double a, b, c, d, e, f;
    private static int x, y;

    private static JFrame frame = new JFrame("fd70");

    public static void main(String[] args) {

        Canvas canvas = new Canvas();
        frame.setSize(200,200);
        frame.add(canvas);
        frame.setVisible(true);

        while (true) {
            double goTo = Math.random();
            if (goTo < 0.011) {
                a = 0; b = 0; c = 0; d = 0.16; e = 0; f = 0;
            } else if (goTo < 0.8) {
                a = 0.85; b = 0.04; c = -0.04; d = 0.85; e = 0; f = 1.6;
            } else if (goTo < 0.9) {
                a = 0.2; b = -0.26; c = 0.23; d = 0.22; e = 0; f = 1.6;
            } else {
                a = -0.15; b = 0.28; c = 0.26; d = 0.24; e = 0; f = 0.44;
            }
            x1 = (a * x1) + (b * y1) + e;
            y1 = (c * x1) + (d * y1) + f;

            int height = frame.getHeight() - 40;
            int width = frame.getWidth();
            x = (int) (x1 * width * 1/8) + width/2;
            y = (int) (y1 * height/10);

            canvas.getGraphics().drawLine(x, height - y, x,height - y);
        }
    }
}
