package pde;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.util.*;

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

        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("굴림", Font.PLAIN, 13));
        }

        //라벨
        JLabel lb1 = new JLabel();
        lb1.setBounds(20,30,184,30);
        lb1.setText("이     름 : "+Info.name);
        contentPane.add(lb1);
        JLabel lb2 = new JLabel();
        lb2.setBounds(20,60,184,30);
        lb2.setText("레     벨 : "+Info.level+"Lv");
        contentPane.add(lb2);
        JLabel lb3 = new JLabel();
        lb3.setBounds(20,90,184,30);
        lb3.setText("경 험 치 : "+Info.exp+"/"+Info.max_exp);
        contentPane.add(lb3);
        JLabel lb4 = new JLabel();
        lb4.setBounds(20,120,184,30);
        lb4.setText("    돈      : "+Info.money+" PD");
        contentPane.add(lb4);
        JLabel lb5 = new JLabel();
        lb5.setBounds(20,150,184,30);
        lb5.setText("캐     쉬 : "+Info.cash+" CASH");
        contentPane.add(lb5);
        JLabel lb6 = new JLabel();
        lb6.setBounds(18,175,184,30);
        lb6.setText("[ 파댕이 ]");
        contentPane.add(lb6);
        JLabel lb7 = new JLabel();
        lb7.setBounds(18,200,184,30);
        lb7.setText("[ EXP ↑ : "+Info.skin*Info.coupon_exp +", PD ↑ : "+Info.skin*Info.coupon_money+" ]");
        contentPane.add(lb7);

        JLabel imgLb = new JLabel();
        ImageIcon img = new ImageIcon("images/pde1.png");
       imgLb.setIcon(img);

        imgLb.setBounds(204,30,150,150);
        contentPane.add(imgLb);


        // 버튼1 생성
        JButton btn1 = new JButton("돈 ↑");
        //프레임에 버튼1 추가
        contentPane.add(btn1);
        // 버튼2 생성
        JButton btn2 = new JButton("경험치 ↑");
        //프레임에 버튼2 추가
        contentPane.add(btn2);
        // 버튼3 생성
        JButton btn3 = new JButton("상     점");
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
        JButton btn6 = new JButton("스킨 변경");
        //프레임에 버튼6추가
        contentPane.add(btn6);
        //버튼 위치설정
        btn1.setBounds(27,231,92,30);
        btn2.setBounds(146,231,92,30);
        btn3.setBounds(265,231,92,30);
        btn4.setBounds(27,271,92,30);
        btn5.setBounds(146,271,92,30);
        btn6.setBounds(265,271,92,30);

        //버튼 클릭시 이벤트 설정
        btn1.addActionListener(event -> {
            Info.moeny_up();
            lb4.setText("    돈      : "+Info.money+" PD");
            lb5.setText("캐     쉬 : "+Info.cash+" CASH");
        });
        btn2.addActionListener(event -> {
            Info.exp_up();
            lb5.setText("캐     쉬 : "+Info.cash+" CASH");
            if(Info.level==100){
                lb2.setText("레     벨 : MAX ");
                lb3.setText("경 험 치 : "+Info.exp+"/"+Info.max_exp);
                Info.money += 1000;
                lb4.setText("    돈      : "+Info.money+" PD");
                JOptionPane.showMessageDialog(null,"100 LEVEL 달성!\n돈 1000원 획득", "레벨 업", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"100레벨이 되어 경험치 ↑ 버튼이 비활성화 됩니다","레벨 업", JOptionPane.INFORMATION_MESSAGE);
                btn2.setEnabled(false);
            }else {
                lb2.setText("레     벨 : " + Info.level + "Lv");
                lb3.setText("경 험 치 : " + Info.exp + "/" + Info.max_exp);
                lb4.setText("    돈      : "+Info.money+" PD");
            }
        });
        btn3.addActionListener(event -> {
            new Shop(lb2, lb3, lb4, lb5, lb7, btn2);
        });
        btn4.addActionListener(event -> {
            Info.cash_add();
            lb5.setText("캐     쉬 : "+Info.cash+" CASH");
            JOptionPane.showMessageDialog(null,Info.input+"CASH가 충전되었습니다", "캐쉬 충전", JOptionPane.INFORMATION_MESSAGE);
        });
        btn5.addActionListener(event -> {
            Info.name_change();
            lb1.setText("이     름 : "+Info.name);
            JOptionPane.showMessageDialog(null, Info.name + "으로 이름이 변경되었습니다", "이름 변경", JOptionPane.INFORMATION_MESSAGE);

        });
        btn6.addActionListener(event -> {
            new Skin(imgLb, lb6, lb7);
        });
        //프레임 크기 설정
        setSize(400, 350);
        //프레임이 보이도록 설정
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}
