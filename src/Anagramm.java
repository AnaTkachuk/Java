

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Anagramm extends JFrame {
    private JTextArea jA = new JTextArea(12,26);
    private JTextField jT = new JTextField(20);
    private JButton but = new JButton("Send");
    private JScrollPane scrl = new JScrollPane(jA);


    public Anagramm(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("AnaGramM");
        setBounds(500,300,300,260);
        setLayout(new FlowLayout());
        setResizable(false);


        jA.setEditable(false);
        jA.setLineWrap(true);

        JPanel wind = new JPanel(new BorderLayout());
        JPanel text = new JPanel(new BorderLayout());


        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message();
            }
    });
        jT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    jA.append(jT.getText()+"\n");
                    jT.setText(" ");
                }
            }
        });

        text.add(jT, BorderLayout.EAST );
        text.add(but,BorderLayout.WEST );
        wind.add(scrl, BorderLayout.SOUTH);
        add(text);
        add(wind);


        setVisible(true);
    }


    public void message(){
        jA.append(jT.getText()+"\n");
        jT.setText(" ");
        jT.grabFocus();

    }




}
