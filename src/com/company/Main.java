package com.company;
import java.awt.event.*;
import java.awt.*;

 class Main extends Frame implements ActionListener{

    TextField tf;
    Button btn;
    Label labl;

    Main(){
        tf = new TextField();
        tf.setBounds(40,40,200,30);
        labl = new Label();
        labl.setBounds(40,80,300,30);
        btn = new Button("Find IP");
        btn.setBounds(40,120,50,30);
        btn.addActionListener(this);
        add(tf);add(labl);add(btn);
        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
            try{
                String webUrl = tf.getText();
                String ipAddress = java.net.InetAddress.getByName(webUrl).getHostAddress();
                labl.setText("IP address of "+webUrl+"is "+ipAddress);
            }catch (Exception ex){
                System.out.println(ex);
            }
    }

    public static void main(String[] args) {
        new Main();
    }


}
