package Course_Work;

import java.awt.*;

public class MapGenerator {
    public int map [][];
    public int brickWight;
    public int brickHight;
    public MapGenerator(int row, int col){
        map = new int[row][col];
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++){
                map[i][j] = 1;
            }
        }
        brickWight = 540/col;
        brickHight = 150/row;
    }

    public void draw(Graphics2D g){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0 ){
                    g.setColor(Color.white);
                    g.fillRect(j * brickWight + 80, i * brickHight + 50, brickWight, brickHight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWight + 80, i * brickHight + 50, brickWight, brickHight);

                }
            }
        }
    }

    public void setBrickValue(int value, int raw, int col) {
        map[raw][col] = value;
    }
}
