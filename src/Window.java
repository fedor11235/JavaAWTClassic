import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class Window extends Frame {

    public Window(String s){

        super(s);

        setLayout(new GridLayout(7,1));
        Label label1 = new Label("Надпись");
        add(label1);

        CheckboxGroup groupbox = new CheckboxGroup();
        Checkbox chk1 = new Checkbox("1", groupbox, false);
        Checkbox chk2 = new Checkbox("2", groupbox, false);
        Checkbox chk3 = new Checkbox("3", groupbox, false);
        Checkbox chk4 = new Checkbox("4", groupbox, false);

        add(chk1);
        add(chk2);
        add(chk3);
        add(chk4);

        Button but = new Button("Ok");
        add(but);
        TextArea txt = new TextArea();
        add(txt);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(txt, BorderLayout.CENTER);
        panel.add(but, BorderLayout.EAST);
        add(panel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                setVisible(false);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Window objWindow = new Window("Окно");
        objWindow.setSize(600, 300);
        objWindow.setVisible(true);
    }
}
