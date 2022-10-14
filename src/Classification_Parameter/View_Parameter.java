package Classification_Parameter;
import Exception.InputRangeException;
import Exception.InputEmptyException;
import Exception.InputFormatException;
import Exception.Exception;

import java.util.Scanner;

public class View_Parameter {


    public static void viewParameter(){ //매개변수
        Scanner sc = new Scanner(System.in);
        int setmenu = selectviewMenu();
        boolean status = false;
        switch (setmenu){
            case 1:
                //general;
                break;
            case 2:
                //vip;
                break;
            case 3:
                //vvip;
                break;
            case 4:
                status = true;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                Classification_Menu.classifiCationMenu();
                break;
        }

    }

    /////////////////분류기준 확인 선택 메뉴/////////////////////
    public static int selectviewMenu(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("==============================");
                System.out.println("분류 기준을 확인할 등급을 선택해 주세요");
                System.out.println("1. GENERAL");
                System.out.println("2. VIP");
                System.out.println("3. VVIP");
                System.out.println("4. 뒤로가기");
                System.out.println("==============================");
                System.out.print("메뉴 선택: ");
                int select = Exception.scannerInt();
                if (select < 1 || select > 4)
                    throw new InputRangeException();
                return select;
            } catch (NumberFormatException e) {
                System.out.println("다시 입력하세요.");
            } catch (InputRangeException e) {
                System.out.println("다시 입력하세요.");
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////






}
