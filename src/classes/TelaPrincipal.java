package classes;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TelaPrincipal extends JFrame {
    //botoes
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton bCon;
    JButton bCor;

    //eventos
    ActionListener b1_click;
    ActionListener b2_click;
    ActionListener b3_click;
    ActionListener b4_click;
    ActionListener b5_click;
    ActionListener b6_click;
    ActionListener b7_click;
    ActionListener b8_click;
    ActionListener b9_click;
    ActionListener bCon_click;
    ActionListener bCor_click;

    //metodos
    public TelaPrincipal(){
        super("Urna Eletrônica do País de Gales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setVisible(true);
        setLayout(null);
          //eventos
        b1_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        b2_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("opa");
            }
        };
        b3_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        b4_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        b5_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        b6_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        b7_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        b8_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        b9_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        bCon_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };
        bCor_click = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        };

        //criando botoes e definindo tamanho e localizcao
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bCon = new JButton("CONFIRMA");
        bCor = new JButton("CORRIGE");


        b1.addActionListener(b1_click);
        b2.addActionListener(b2_click);
        b3.addActionListener(b3_click);
        b4.addActionListener(b4_click);
        b5.addActionListener(b5_click);
        b6.addActionListener(b6_click);
        b7.addActionListener(b7_click);
        b8.addActionListener(b8_click);
        b9.addActionListener(b9_click);
        bCon.addActionListener(bCon_click);
        bCor.addActionListener(bCor_click);
      

        b1.setBounds(50,50, 120,30);
        b2.setBounds(180,50, 120,30);
        b3.setBounds(310,50, 120,30);
        b4.setBounds(50,100, 120,30);
        b5.setBounds(180,100, 120,30);
        b6.setBounds(310,100, 120,30);
        b7.setBounds(50,150, 120,30);
        b8.setBounds(180,150, 120,30);
        b9.setBounds(310,150, 120,30);
        bCon.setBounds(50,200, 120,30);
        bCor.setBounds(180,200, 120,30);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bCon);
        add(bCor);
        
        

    }
    
    
}
