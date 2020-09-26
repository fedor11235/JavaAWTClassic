import java.awt.*;
import java.awt.event.*;

public class Quiz extends Frame {

    public Quiz(String s) {

        super(s);

        setLayout(new GridLayout(5, 1));
        Colors colors = new Colors();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                setVisible(false);
                System.exit(0);
            }
        });
    }

    public class Colors implements ItemListener {

        Choice colors = new Choice();
        Label choiceText = new Label("Выберите цвет:");

        public Colors() {
            colors.add("Белый");
            colors.add("Зеленый");
            colors.add("Красный");
            colors.add("Желтый");
            colors.add("Синий");
            colors.add("Черный");
            add(choiceText);
            add(colors);
            colors.addItemListener(this);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            switch (colors.getSelectedItem()) {

                case "Белый":
                    setBackground(Color.white);
                    choiceText.setBackground(Color.white);
                    choiceText.setForeground(Color.black);
                    break;

                case "Зеленый":
                    setBackground(Color.green);
                    choiceText.setBackground(Color.green);
                    choiceText.setForeground(Color.black);
                    break;

                case "Красный":
                    setBackground(Color.red);
                    choiceText.setBackground(Color.red);
                    break;

                case "Желтый":
                    setBackground(Color.yellow);
                    choiceText.setBackground(Color.yellow);
                    choiceText.setForeground(Color.black);
                    break;

                case "Синий":
                    setBackground(Color.blue);
                    choiceText.setBackground(Color.blue);
                    break;

                case "Черный":
                    setBackground(Color.black);
                    choiceText.setBackground(Color.black);
                    choiceText.setForeground(Color.white);
                    break;

                default:
                    setBackground(Color.white);
                    choiceText.setBackground(Color.white);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Quiz objQuiz = new Quiz("Online Quiz");
        objQuiz.setSize(300, 300);
        objQuiz.setVisible(true);
    }
}