import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        Dimension framesize=new Dimension(600,500);
        frame.setSize(framesize);
        JPanel panel=new JPanel();
        panel.setSize(framesize);
        GridBagConstraints constraints = new GridBagConstraints();
        panel.setLayout(new GridLayout(2,2));
       // panel.setLayout(null);
        JLabel label1=new JLabel("ENTER YOUR LANGUAGE:");
        //label1.setBounds(50,150,200,20);
        panel.add(label1);
        JLabel label2=new JLabel("زبان مورد نظر را وارد کنید");
        //label2.setBounds(450,150,150,20);
        panel.add(label2);
        JButton b1=new JButton("ENGLISH");
       // b1.setBounds(50,200,100,20);
        JButton b2=new JButton("فارسی");
        //b1.setBounds(450,200,60,20);
        panel.add(b1);
        panel.add(b2);
        panel.setBackground(new Color(200,220,200));
        frame.add(panel);
        frame.setVisible(true);
        JPanel panel2=new JPanel();
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel);
                panel2.setSize(framesize);
                frame.add(panel2);
                frame.revalidate();
                frame.repaint();
            }
        });
        panel2.setLayout(null);
        JLabel label22=new JLabel("رمز خود را وارد کنید:");
        label22.setBounds(250,100,100,20);
        panel2.add(label22);
        JTextField text2=new JTextField("");
        text2.setBounds(280,120,100,30);
        panel2.add(text2);
        panel2.setBackground(new Color(200,220,200));
        JButton bb2=new JButton("ثبت");
        bb2.setBounds(230,120,50,30);
        panel2.add(bb2);
        JPanel panel3=new JPanel();
        bb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel2);
                panel3.setSize(framesize);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();

            }
        });
        JPanel panelakhar=new JPanel();
        panelakhar.setLayout(null);
        JLabel last=new JLabel("عملیات با موفقیت انجام شد!");
        last.setBounds(250,200,200,20);
        panelakhar.setBackground(new Color(200,220,200));
         panelakhar.add(last);

        //panel3.setLayout(null);
        JPanel panell1=new JPanel();
        JButton but1=new JButton("نغییر رمز");
       // but1.setBounds(400,200,100,20);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                panell1.setSize(framesize);
                frame.add(panell1);
                frame.revalidate();
                frame.repaint();

            }
        });
        panell1.setLayout(null);
        JLabel label=new JLabel("رمز جدید را وارد کنید:");
        label.setBounds(250,100,100,20);
        panell1.add(label);
        JTextField text1=new JTextField("");
        text1.setBounds(280,120,100,30);
        panell1.add(text1);
        panell1.setBackground(new Color(200,220,200));
        JButton bl1=new JButton("ثبت");
        bl1.setBounds(230,120,50,30);
        bl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panell1);
                panelakhar.setSize(framesize);
                frame.add(panelakhar);
                frame.revalidate();
                frame.repaint();

            }
        });

        JButton back1=new JButton("بازگشت");
        back1.setBounds(250,400,100,20);
        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panell1);
                panel3.setSize(framesize);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();

            }
        });
        panell1.add(back1);
        panell1.add(bl1);
        panel3.add(but1);

        JButton but2=new JButton("برداشت وجه");
        //but2.setBounds(400,200,100,20);
        JPanel panell2=new JPanel();
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                panell2.setSize(framesize);
                frame.add(panell2);
                frame.revalidate();
                frame.repaint();

            }
        });
        panell2.setBackground(new Color(200,220,200));
        panel3.add(but2);
        panell2.setLayout(null);
        JLabel labell=new JLabel("مبلغ مورد نظر را وارد کنید:");
        labell.setBounds(250,100,110,20);
        panell2.add(labell);
       JTextField text11=new JTextField("");
       text11.setBounds(280,120,100,30);
       panell2.add(text11);
        JButton bl=new JButton("ثبت");
        bl.setBounds(230,120,50,30);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panell2);
                panelakhar.setSize(framesize);
                frame.add(panelakhar);
                frame.revalidate();
                frame.repaint();

            }
        });

        panell2.add(bl);
        JButton back2=new JButton("بازگشت");
        back2.setBounds(250,400,100,20);
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panell2);
                panel3.setSize(framesize);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();

            }
        });
        panell2.add(back2);
        panel3.add(but2);


        JButton but3=new JButton("اعلام موجودی");
       // but2.setBounds(50,100,100,20);
        JPanel panell3=new JPanel();
        panell3.setLayout(null);
        JLabel la=new JLabel("موجودی حساب شما:56,350,000 ریال");
         JButton sabt3=new JButton("ثبت");
         sabt3.setBounds(230,150,50,30);
        sabt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panell3);
                panelakhar.setSize(framesize);
                frame.add(panelakhar);
                frame.revalidate();
                frame.repaint();

            }
        });
        panell3.add(sabt3);




        JButton back3=new JButton("بازگشت");
        back3.setBounds(250,400,100,20);
        back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panell3);
                panel3.setSize(framesize);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();

            }
        });
        panell3.add(back3);
        la.setBounds(230,120,200,30);
        panell3.add(la);
        panell3.setBackground(new Color(200,220,200));
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                panell3.setSize(framesize);
                frame.add(panell3);
                frame.revalidate();
                frame.repaint();

            }
        });
        panel3.add(but3);
        JButton but4=new JButton("کارت به کارت");
        //but2.setBounds(40,300,100,20);
        JPanel panell4=new JPanel();
        panell4.setBackground(new Color(200,220,200));
        panel3.add(but4);

        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                panell4.setSize(framesize);
                frame.add(panell4);
                frame.revalidate();
                frame.repaint();

            }
        });
        panell4.setLayout(null);
        JLabel labell4=new JLabel("مبلغ مورد نظر را وارد کنید:");
        labell4.setBounds(250,80,110,20);
        panell4.add(labell4);
        JTextField text41=new JTextField("");
        text41.setBounds(250,100,110,30);
        panell4.add(text41);

        JLabel labell42=new JLabel("شماره کارت مقصد را وارد کنید:");
        labell42.setBounds(250,140,200,20);
        panell4.add(labell42);
        JTextField text42=new JTextField("");
        text42.setBounds(250,160,110,30);
        panell4.add(text42);

        JButton bl4=new JButton("ثبت");
        bl4.setBounds(275,200,50,30);
        bl4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panell4);
                panelakhar.setSize(framesize);
                frame.add(panelakhar);
                frame.revalidate();
                frame.repaint();

            }
        });

        panell4.add(bl4);
        JButton back4=new JButton("بازگشت");
        back4.setBounds(250,400,100,20);
        back4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panell4);
                panel3.setSize(framesize);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();

            }
        });
        panell4.add(back4);



        JButton but5=new JButton("بازگشت");
        but2.setBounds(200,300,100,20);
        panel3.add(but5);
        but5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                panel2.setSize(framesize);
                frame.add(panel2);
                frame.revalidate();
                frame.repaint();

            }
        });
        panel3.add(but5);
        panel3.setBackground(new Color(200,220,200));

    }}
