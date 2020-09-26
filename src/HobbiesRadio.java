import java.awt.*;

import java.awt.event.*;



class HobbiesRadio extends Frame{
    //создание группы чек-боксов
    CheckboxGroup groupbox = new CheckboxGroup();
    //изначально все кнопки являются не выбранными
    Checkbox chkReading = new Checkbox("Reading", groupbox, false);
    Checkbox chkMusic = new Checkbox("Music", groupbox, false);
    Checkbox chkPainting = new Checkbox("Painting", groupbox, false);
    Checkbox chkMovies = new Checkbox("Movies", groupbox, false);
    Checkbox chkDancing = new Checkbox("Dancing", groupbox, false);
    Label lb1 = new Label("What's you hobby?");

    public HobbiesRadio(String s){
        //создание фрейма
        super(s);

        setLayout(new GridLayout(6,1));
        //настройка макета размещения для GUI

        add(lb1);
        add(chkReading);
        add(chkMusic);
        add(chkPainting);
        add(chkMovies);
        add(chkDancing);

        //для закрытия фрейма
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                setVisible(false);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        HobbiesRadio objHobbiesRadio = new HobbiesRadio("A basket full of chekboxes!");
        objHobbiesRadio.setSize(400, 400);
        objHobbiesRadio.setVisible(true);
    }
}

