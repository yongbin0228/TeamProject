package pde;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Container contentPane;
    Main() {
        //프레임 제목 설정
        setTitle("파댕이 키우기");
        //프레임을 화면 가운데에 배치
        setLocationRelativeTo(null);
        //프레임을 닫았을 때 메모리에서 제거되도록 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(null);

        // 버튼1 생성
        JButton btn1 = new JButton("돈 ↑");
        //프레임에 버튼1 추가
        contentPane.add(btn1);
        // 버튼2 생성
        JButton btn2 = new JButton("경험치 ↑");
        //프레임에 버튼2 추가
        contentPane.add(btn2);
        // 버튼3 생성
        JButton btn3 = new JButton("상점 이동");
        //프레임에 버튼3 추가
        contentPane.add(btn3);
        // 버튼4 생성
        JButton btn4 = new JButton("캐쉬 충전");
        //프레임에 버튼4 추가
        contentPane.add(btn4);
        // 버튼5생성
        JButton btn5 = new JButton("이름 변경");
        //프레임에 버튼5 추가
        contentPane.add(btn5);
        // 버튼6 생성
        JButton btn6 = new JButton("사진 변경");
        //프레임에 버튼6추가
        contentPane.add(btn6);
        //버튼 위치설정
        btn1.setBounds(27,231,92,30);
        btn2.setBounds(146,231,92,30);
        btn3.setBounds(265,231,92,30);
        btn4.setBounds(27,271,92,30);
        btn5.setBounds(146,271,92,30);
        btn6.setBounds(265,271,92,30);

        //라벨
        JLabel lb1 = new JLabel();
        lb1.setBounds(20,30,184,30);
        lb1.setText("이     름 : 파댕이");
        contentPane.add(lb1);
        JLabel lb2 = new JLabel();
        lb2.setBounds(20,60,184,30);
        lb2.setText("레     벨 : 214241Lv");
        contentPane.add(lb2);
        JLabel lb3 = new JLabel();
        lb3.setBounds(20,90,184,30);
        lb3.setText("경험치 : 1311311/1931321");
        contentPane.add(lb3);
        JLabel lb4 = new JLabel();
        lb4.setBounds(20,120,184,30);
        lb4.setText("    돈      : 3245224234 PD");
        contentPane.add(lb4);
        JLabel lb5 = new JLabel();
        lb5.setBounds(20,150,184,30);
        lb5.setText("캐     쉬 : 2031421 CASH");
        contentPane.add(lb5);

        JLabel imgLb1 = new JLabel();
        ImageIcon img = new ImageIcon("images/pde1.png");
        imgLb1.setIcon(img);

        imgLb1.setBounds(204,30,150,150);
        contentPane.add(imgLb1);

        //프레임 크기 설정
        setSize(400, 350);
        //프레임이 보이도록 설정
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}
