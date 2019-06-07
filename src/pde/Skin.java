package pde;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.util.*;

public class Skin extends JFrame{
    Container contentPane;
    Skin(){
        //프레임 제목 설정
        setTitle("스킨 설정");
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


    }

}
