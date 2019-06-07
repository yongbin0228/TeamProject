package pde;

import javax.swing.*;

class Info {
    //기본값 설정
    static String name = "파댕이";
    static int level = 1;
    static int exp = 0;
    static int max_exp = 10;
    static int money = 100;
    static int cash = 100;
    static String input;
    static String input2;

    static void moeny_up() {
        money++;
    }

    static void exp_up() {
        exp++;
        if (exp >= max_exp) {
            level++;
            exp = 0;
            max_exp += 10;
        }
    }

    static void name_change() {
        while (true) {
            input = JOptionPane.showInputDialog("바꿀 이름을 입력하세요 2~8자 [ 현재 이름 : " + name + " ]");
            if (input.length() < 2 || input.length() > 8) {
                JOptionPane.showMessageDialog(null, "이름은 2~8자로만 가능합니다", "이름 변경", JOptionPane.WARNING_MESSAGE);
            } else {
                name = input;
                break;
            }
        }
    }

    static void cash_add() {

        While : while (true) {
            input = JOptionPane.showInputDialog("충전 금액을 입력하세요 [ 1000, 5000, 10000, 50000 ] ");
            if (!(input.equals("1000") || input.equals("5000") || input.equals("10000") || input.equals("50000"))) {
                JOptionPane.showMessageDialog(null, "금액이 올바르지 않습니다", "캐쉬 충전", JOptionPane.WARNING_MESSAGE);
            } else {
                while(true) {
                    input2 = JOptionPane.showInputDialog("충전 코드를 입력하세요 ex) 1234-5678-1234-5678 ");
                    if (!(input2.charAt(4) == '-' && input2.charAt(9) == '-' && input2.charAt(14) == '-')) {
                        JOptionPane.showMessageDialog(null, "코드가 올바르지 않습니다", "캐쉬 충전", JOptionPane.WARNING_MESSAGE);
                    }else{
                        cash+=Integer.valueOf(input);
                        break While;
                    }
                }
            }
        }
    }
}
