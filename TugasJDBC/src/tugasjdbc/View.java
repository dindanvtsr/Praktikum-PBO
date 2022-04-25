/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjdbc;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Lenovo
 */
public class View extends JFrame implements ActionListener {
    public String username, password, username1, password1;
    
    Connector connector = new Connector(); 
    
    JLabel lTitle = new JLabel("Login");
    
    JLabel lUsername = new JLabel("Username");
    JTextField fUsername = new JTextField(10);
    
    JLabel lPassword = new JLabel("Password");
    JTextField fPassword = new JTextField(10);
        
    JLabel lTitle2 = new JLabel("Register");
    
    JLabel lUsername1 = new JLabel("Username");
    JTextField fUsername1 = new JTextField(10);
    
    JLabel lPassword1 = new JLabel("Password");
    JTextField fPassword1 = new JTextField(10);
    
    JButton bLogin = new JButton("Login");
    JButton bRegister = new JButton("Daftar");
    
    public View() {
        setTitle("JDBC - Login dan Register");
        setSize(600,320);
        
        setLayout(null);
        add(lTitle);
        add(lTitle2);
        add(lUsername);
        add(fUsername);
        add(lPassword);
        add(fPassword);
        add(lUsername1);
        add(fUsername1);
        add(lPassword1);
        add(fPassword1);
        add(bLogin);
        add(bRegister);
        
        //edit penempatan
        lTitle.setBounds(135,30,120,20);
        lUsername.setBounds(70,70,120,20);
        fUsername.setBounds(70,100,165,27);
        lPassword.setBounds(70,140,120,20);
        fPassword.setBounds(70,170,165,27);
        bLogin.setBounds(115,213,80,27);
        lTitle2.setBounds(408,30,120,20);
        lUsername1.setBounds(350,70,165,27);
        fUsername1.setBounds(350,100,165,27);
        lPassword1.setBounds(350,140,120,20);
        fPassword1.setBounds(350,170,165,27);
        bRegister.setBounds(395,213,80,27);
        
        bLogin.addActionListener(this);
        bRegister.addActionListener(this);
        
        setVisible(true); //agar gui muncul
        setDefaultCloseOperation(EXIT_ON_CLOSE); //kalau close berenti run
        setLocationRelativeTo(null); //lokasi gui ditengah
        
        bLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(arg0.getSource() == bLogin) {
                    String user = fUsername.getText();
                    System.out.println(user);
                    if (connector.checkUsername(user) && user != "" && connector.checkLogin(user, String.valueOf(fPassword.getText()))) {
                        JOptionPane.showMessageDialog(null, "Berhasil Login");
                    }
                    else if (user.isEmpty() || String.valueOf(fPassword.getText()).isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Mohon Isi Seluruh Kolom");
                    }
                    else if (!connector.checkUsername(user)) {
                        JOptionPane.showMessageDialog(null, "Username Tidak Ditemukan");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Password Yang Anda Masukkan Salah");
                    }
                }
            }
        });
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bRegister) {
            try { 
                String query = "INSERT INTO `users`(`username`,`password`) VALUES ('"+getUsername1()+"','"+getPassword1()+"')";
                
                connector.statement = connector.koneksi.createStatement();
                connector.statement.executeUpdate(query);

                System.out.println("Berhasil Mendaftarkan User");
                JOptionPane.showMessageDialog(null,"Berhasil Mendaftarkan User");
            } catch (Exception ex){
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null,"Username Sudah Digunakan");
            }
        }
        
    }
    
    public String getUsername1() {
        return fUsername1.getText();
    }

    public String getPassword1() {
        return fPassword1.getText();
    }
}
