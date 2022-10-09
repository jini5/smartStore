package Store;
import java.util.*;
import java.io.*;

import static Classification_Parameter.Classification.classifiCation;
import static Customer_Data.Add_Customer_Data.addData_main;
import static Customer_Data.Customer.customerMenu;
import static Summary.Summary.summary;

public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println("========================");
        System.out.println("1. 고객 분류");
        System.out.println("2. 고객 정보");
        System.out.println("3. 요약");
        System.out.println("4. 프로그램 종료");
        System.out.println("========================");
        System.out.print("메뉴 선택: ");
        selectMainMenu();

    }

    public static void selectMainMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        switch(menu){
            case 1:
                System.out.println("분류 메뉴 선택");
                classifiCation();
                break;
            case 2:
                System.out.println("고객 정보 선택");
                addData_main();
                break;
            case 3:
                System.out.println("요약 선택");
                summary();
                break;
            case 4:
                System.out.println("프로그램 종료");
                break;
        }
    }


    public void Quit(){


    }


}