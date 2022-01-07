/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopchonmau;

/**
 *
 * @author Admin
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ColorFrame extends JFrame implements ActionListener{
    private JButton OK = new JButton("OK");
    private JButton Cancel = new JButton("Cancel");
    private JPanel p = new JPanel();
    private JComboBox<String> chon = new JComboBox<>();
    public ColorFrame(String title) throws HeadlessException{
        super(title);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        
        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());
        
        chon.addItem("Xanh");
        chon.addItem("Đỏ");
        chon.addItem("Tím");
        chon.addItem("Vàng");
        ps.add(OK);
        ps.add(Cancel);
        ps.add(chon);
        
        add(ps, BorderLayout.SOUTH);
        
        OK.addActionListener(this);
        Cancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("OK")){
            String s = chon.getSelectedItem().toString();
            if(s.equals("Xanh")) p.setBackground(Color.blue);
            if(s.equals("Đỏ")) p.setBackground(Color.red);
            if(s.equals("Tím")) p.setBackground(Color.magenta);
            if(s.equals("Vàng")) p.setBackground(Color.yellow);
        }
        else if(cmd.endsWith("Cancel")){
            p.setBackground(Color.white);
        }
    }
    public void itemStateChanged(ItemEvent e){
        String s = chon.getSelectedItem().toString();
        if(s.equals("Xanh")) p.setBackground(Color.blue);
        if(s.equals("Đỏ")) p.setBackground(Color.red);
        if(s.equals("Tím")) p.setBackground(Color.magenta);
        if(s.equals("Vàng")) p.setBackground(Color.yellow);
    }
}
