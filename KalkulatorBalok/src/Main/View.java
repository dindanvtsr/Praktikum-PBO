/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.event.*;
import javax.swing.*;
import ruang.Balok;

/**
 *
 * @author Lenovo
 */
public class View extends JFrame implements ActionListener {
    JLabel lTitle = new JLabel("Cuboid Calculator");
    
    JLabel lLength = new JLabel("Length");
    final JTextField fLength = new JTextField(10);
    
    JLabel lWidth = new JLabel("Width");
    final JTextField fWidth = new JTextField(10);
    
    JLabel lHeight = new JLabel("Height");
    final JTextField fHeight = new JTextField(10);
        
    JLabel lTitleResult = new JLabel("Result :");
    
    JLabel lSquareArea = new JLabel();
    JLabel lSquareC = new JLabel();
    JLabel lCuboidVolume = new JLabel();
    JLabel lCuboidSA = new JLabel();
    
    JButton bCount = new JButton("Count");
    JButton bReset = new JButton("Reset");
    
    public View() {
        setTitle("Tugas 3 - Kalkulator Balok");
        setSize(400,500);
        
        setLayout(null);
        add(lTitle);
        add(lTitleResult);
        add(lLength);
        add(fLength);
        add(lWidth);
        add(fWidth);
        add(lHeight);
        add(fHeight);
        add(bCount);
        add(bReset);
        
        //edit penempatan
        lTitle.setBounds(145,30,120,20);
        lLength.setBounds(70,70,120,20);
        fLength.setBounds(140,70,165,20);
        lWidth.setBounds(70,120,120,20);
        fWidth.setBounds(140,120,165,20);
        lHeight.setBounds(70,170,120,20);
        fHeight.setBounds(140,170,165,20);
        lTitleResult.setBounds(175,210,120,20);
        bCount.setBounds(110,410,80,20);
        bReset.setBounds(200,410,80,20);
        
        bCount.addActionListener(this);
        bReset.addActionListener(this);
        
        setVisible(true); //agar gui muncul
        setDefaultCloseOperation(EXIT_ON_CLOSE); //kalau close berenti run
        setLocationRelativeTo(null); //lokasi gui ditengah
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bCount) { //ketika count diklik
            try {
                double length = Double.parseDouble(fLength.getText());
                double width = Double.parseDouble(fWidth.getText());
                double height = Double.parseDouble(fHeight.getText());
                
                Balok balok = new Balok(height, length, width);
                
                lSquareArea.setText("Square Area                   : " + Double.toString(balok.area()));
                add(lSquareArea);
                lSquareArea.setBounds(70,250,180,20);
                
                lSquareC.setText("Square Circumference  : " + Double.toString(balok.circumference()));
                add(lSquareC);
                lSquareC.setBounds(70,280,180,20);
                
                lCuboidVolume.setText("Cuboid Volume              : " + Double.toString(balok.volume()));
                add(lCuboidVolume);
                lCuboidVolume.setBounds(70,310,180,20);
                
                lCuboidSA.setText("Cuboid Surface Area     : " + Double.toString(balok.surfaceArea()));
                add(lCuboidSA);
                lCuboidSA.setBounds(70,340,180,20);   
            } catch(NumberFormatException d){
                JOptionPane.showMessageDialog(null, d.getMessage());
            }
        }
        
        if(e.getSource() == bReset) { //ketika reset di klik
            fLength.setText(null);
            fWidth.setText(null);
            fHeight.setText(null);
            lSquareArea.setText(null);
            lSquareC.setText(null);
            lCuboidVolume.setText(null);
            lCuboidSA.setText(null);
        }
    }
}
