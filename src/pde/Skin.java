package pde;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.util.Enumeration;

class Skin extends JFrame {
    Container contentPane;
    static boolean hasSkin2 = false;
    static boolean hasSkin3 = false;
    static boolean hasSkin4 = false;
    static boolean hasSkin5 = false;
    static boolean hasSkin6 = false;
    static JButton button1 = new JButton("파댕이");
    static JButton button2 = new JButton("충성 파댕이");
    static JButton button3 = new JButton("불의 축제 파댕이");
    static JButton button4 = new JButton("리치 파댕이");
    static JButton button5 = new JButton("나 파댕이 아니다");
    static JButton button6 = new JButton("내가 젖소 파댕이");

    Skin(JLabel imgLb) {
        //프레임 제목 설정
        setTitle("스킨 설정");
        //프레임을 화면 가운데에 배치
        setLocationRelativeTo(null);
        contentPane = getContentPane();
        contentPane.setLayout(null);

        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("굴림", Font.PLAIN, 13));
        }
        //라벨 생성
        JLabel imgLb1 = new JLabel();
        ImageIcon img1 = new ImageIcon("images/100_pde1.png");
        imgLb1.setIcon(img1);
        JLabel imgLb2 = new JLabel();
        ImageIcon img2 = new ImageIcon("images/100_pde2.png");
        imgLb2.setIcon(img2);
        JLabel imgLb3 = new JLabel();
        ImageIcon img3 = new ImageIcon("images/100_pde3.png");
        imgLb3.setIcon(img3);
        JLabel imgLb4 = new JLabel();
        ImageIcon img4 = new ImageIcon("images/100_pde4.png");
        imgLb4.setIcon(img4);
        JLabel imgLb5 = new JLabel();
        ImageIcon img5 = new ImageIcon("images/100_pde5.png");
        imgLb5.setIcon(img5);
        JLabel imgLb6 = new JLabel();
        ImageIcon img6 = new ImageIcon("images/100_pde6.png");
        imgLb6.setIcon(img6);

        //라벨 위치설정
        imgLb1.setBounds(80, 18, 100, 100);
        imgLb2.setBounds(242, 18, 100, 100);
        imgLb3.setBounds(400, 18, 100, 100);
        imgLb4.setBounds(80, 159, 100, 100);
        imgLb5.setBounds(242, 159, 100, 100);
        imgLb6.setBounds(400, 159, 100, 100);

        //프레임에 라벨 추가
        contentPane.add(imgLb1);
        contentPane.add(imgLb2);
        contentPane.add(imgLb3);
        contentPane.add(imgLb4);
        contentPane.add(imgLb5);
        contentPane.add(imgLb6);

        //프레임에 버튼 추가
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        contentPane.add(button6);
        if (!(hasSkin2))
            button2.setEnabled(false);
        if (!(hasSkin3))
            button3.setEnabled(false);
        if (!(hasSkin4))
            button4.setEnabled(false);
        if (!(hasSkin5))
            button5.setEnabled(false);
        if (!(hasSkin6))
            button6.setEnabled(false);

        button1.setBounds(55, 123, 150, 30);
        button2.setBounds(217, 123, 150, 30);
        button3.setBounds(379, 123, 150, 30);
        button4.setBounds(55, 263, 150, 30);
        button5.setBounds(217, 263, 150, 30);
        button6.setBounds(379, 263, 150, 30);

        ImageIcon img11 = new ImageIcon("images/pde1.png");
        ImageIcon img22 = new ImageIcon("images/pde2.png");
        ImageIcon img33 = new ImageIcon("images/pde3.png");
        ImageIcon img44 = new ImageIcon("images/pde4.png");
        ImageIcon img55 = new ImageIcon("images/pde5.png");
        ImageIcon img66 = new ImageIcon("images/pde6.png");

        button1.addActionListener(event -> {
            imgLb.setIcon(img11);
            dispose();
        });
        button2.addActionListener(event -> {
            imgLb.setIcon(img22);
            dispose();
        });
        button3.addActionListener(event -> {
            imgLb.setIcon(img33);
            dispose();
        });
        button4.addActionListener(event -> {
            imgLb.setIcon(img44);
            dispose();
        });
        button5.addActionListener(event -> {
            imgLb.setIcon(img55);
            dispose();
        });
        button6.addActionListener(event -> {
            imgLb.setIcon(img66);
            dispose();
        });

        //프레임 크기 설정
        setSize(600, 350);

        //프레임이 보이도록 설정
        setVisible(true);

    }

    public static void skin1_buy() {
        JOptionPane.showMessageDialog(null, "파댕이 스킨을 획득하였습니다", "상점", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void skin2_buy() {
        hasSkin2 = true;
        JOptionPane.showMessageDialog(null, "충성 파댕이 스킨을 획득하였습니다", "상점", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void skin3_buy() {
        hasSkin3 = true;
        JOptionPane.showMessageDialog(null, "불의 축제 파댕이 스킨을 획득하였습니다", "상점", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void skin4_buy() {
        hasSkin4 = true;
        JOptionPane.showMessageDialog(null, "리치 파댕이 스킨을 획득하였습니다", "상점", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void skin5_buy() {
        hasSkin5 = true;
        JOptionPane.showMessageDialog(null, "나 파댕이 아니다 스킨을 획득하였습니다", "상점", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void skin6_buy() {
        hasSkin6 = true;
        JOptionPane.showMessageDialog(null, "내가 젖소 파댕이 스킨을 획득하였습니다", "상점", JOptionPane.INFORMATION_MESSAGE);
    }



    public static void skin_all_buy() {
        hasSkin2 = true;
        hasSkin3 = true;
        hasSkin4 = true;
        hasSkin5 = true;
        hasSkin6 = true;
        JOptionPane.showMessageDialog(null, "모든 스킨을 획득 하였습니다", "상점", JOptionPane.INFORMATION_MESSAGE);
    }


}
