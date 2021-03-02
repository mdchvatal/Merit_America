package LectureExamples1;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class checkerboard extends GraphicsProgram{
    private static final int NUM_ROWS = 8;
    private static final int NUM_COLUMNS = 8;

    public void run() {
        int sqrSize = getHeight() / NUM_ROWS;
        for (int i = 0; i < NUM_ROWS; i++){
            for (int j = 0; j < NUM_COLUMNS; j++) {
                int x = i * sqrSize;
                int y = j * sqrSize;
                GRect  sq = new GRect(x, y, sqrSize, sqrSize);
                sq.setFilled(true);
                if (((i+j) % 2) != 0) {
                    sq.setFillColor(Color.RED);
                } else sq.setFillColor(Color.BLACK);
                add(sq);
            }
        }
    }
}
