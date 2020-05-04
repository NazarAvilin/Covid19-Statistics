package gui;

import service.GetApi;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppGui {

    private JPanel panel;
    private JTextField country;
    private JButton find;
    private JTextPane show;
    GetApi api = new GetApi();


    public AppGui() {
        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    show.setText(String.valueOf(api.myLink(country.getText())));
                }catch (Exception exception) {
                    exception.printStackTrace();
                    show.setText("Пустое поле или страна не существует!\nПроверьте данные и попробуйте ещё раз!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AppGui");
        frame.setContentPane(new AppGui().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,410);
        frame.setLocationRelativeTo(null);
    }
}
