package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;

public class RandomCircles extends GraphicsProgram {
    RandomGenerator rgen = new RandomGenerator();

    public void run() {
        for (int i = 0; i < 10; i++) {
            genCircle();
        }
    }

    private void genCircle() {
        int diameter = rgen.nextInt(10, 100);
        double xAxis = rgen.nextDouble(0, (getWidth()-diameter));
        double yAxis = rgen.nextDouble(0, (getHeight()-diameter));
        Color color = rgen.nextColor();
        GOval circle = new GOval(xAxis, yAxis, diameter, diameter);
        circle.setFilled(true);
        circle.setFillColor(color);
        add(circle);
    }

}
