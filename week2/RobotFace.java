package week2;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

public class RobotFace extends GraphicsProgram {
    public static final int HEAD_HEIGHT = 400;
    public static final int HEAD_WIDTH = 300;
    public static final int EYE_RADIUS = HEAD_WIDTH / 7;
    public static final int MOUTH_WIDTH = (HEAD_WIDTH / 4) *3;
    public static final int MOUTH_HEIGHT = HEAD_HEIGHT / 6;

    int click_counter = 0;

    public void init() {
        addMouseListeners();
    }

    public void mouseClicked(MouseEvent e) {
        if (click_counter == 0) {
            createHead();
            click_counter++;
        } else if (click_counter == 1) {
            createEyes();
            click_counter++;
        } else {
            createMouth();
            click_counter++;
        }
    }

    private void createHead() {
        GRect head = new GRect(((getWidth()-HEAD_WIDTH)/2), ((getHeight()-HEAD_HEIGHT)/2) , HEAD_WIDTH, HEAD_HEIGHT);
        head.setFilled(true);
        head.setFillColor(Color.GRAY);
        head.setColor(Color.BLACK);
        add(head);
    }

    public void createEyes() {
        GOval leftEye = new GOval(((EYE_RADIUS)*2), ((EYE_RADIUS)*2));
        GOval rightEye = new GOval(((EYE_RADIUS)*2), ((EYE_RADIUS)*2));
        leftEye.setFilled(true);
        rightEye.setFilled(true);
        leftEye.setFillColor(Color.YELLOW);
        rightEye.setFillColor(Color.YELLOW);
        addEyes(leftEye, rightEye);
    }

    private void addEyes(GOval leftEye, GOval rightEye) {
        add(leftEye, ((((getWidth()-HEAD_WIDTH)/2)+(HEAD_WIDTH/4))-EYE_RADIUS),
                (((getHeight()-HEAD_HEIGHT)/2)+(HEAD_HEIGHT/4))-EYE_RADIUS);
        add(rightEye, (((getWidth()-HEAD_WIDTH)/2)+((HEAD_WIDTH/4)*3)-EYE_RADIUS),
                (((getHeight()-HEAD_HEIGHT)/2)+(HEAD_HEIGHT/4))-EYE_RADIUS);
    }

    private void createMouth() {
        GRect mouth = new GRect(MOUTH_WIDTH, MOUTH_HEIGHT);
        mouth.setFilled(true);
        mouth.setFillColor(Color.WHITE);
        addMouth(mouth);
    }

    private void addMouth(GRect mouth) {
        add(mouth, ((((getWidth()-HEAD_WIDTH)/2)+((HEAD_WIDTH-mouth.getWidth())/2))),
                ((getHeight()-HEAD_HEIGHT/2)+HEAD_HEIGHT*(3/4))+mouth.getHeight()/2);
    }
}
