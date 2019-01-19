package Course_Work;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10, 10, 700, 600); // розташування і розмір компоненту GUI
        obj.setTitle("__Breakout_Ball__");
        obj.setResizable(false); // щоб незмвнювався розмір вікна
        obj.setVisible(true); // щоб вікно було видиме
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);


    }

}
