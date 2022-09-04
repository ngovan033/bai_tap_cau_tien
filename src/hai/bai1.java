/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hai;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author admin
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. tìm bội số chung nhỏ nhất của 2 số, 3 số, 100 số tự nhiên
//        int bcnn;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số thứ nhất");
//        int n1 = sc.nextInt();
//        System.out.println("nhập số thứ hai");
//        int n2 = sc.nextInt();
//        bcnn = (n1 > n2) ? n1 : n2;
//        while (true) {
//
//            if (bcnn % n1 == 0 && bcnn % n2 == 0) {
//                System.out.printf("bội chung nhỏ nhất  là: %d   ", bcnn);
//                break;
//            }
//            bcnn++;
//        }
//    }
//}
//2. Tìm ước chung lớn nhất của 2 số, 3 số, 50 số tự nhiên
//      int ucln;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số thứ nhất");
//        int n1 = sc.nextInt();
//        System.out.println("nhập số thứ hai");
//        int n2 = sc.nextInt();
//        while (n1 != n2) {
//            if(n1 > n2)
//                n1 = n1 - n2;
//            else
//                n2 = n2 - n1;
//        }
//        System.out.printf("Ước chung lớn nhất là: %d", n2);
//    }
//}
//3. Tìm tất cả ước chung của 2 số, 3 số, n số
//        Scanner s = new Scanner(System.in);
//        System.out.print("nhập số a  : ");
//        int a = s.nextInt();
//        System.out.print("nhập số b : ");
//        int b = s.nextInt();
//
//        for (int i = 1; i <= a && i <= b; i++) {
//
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i + " ");
//
//            }
//        }

//4. Nhập n, kiểm tra n có phải số nguyên tố hay không
//        Scanner s = new Scanner(System.in);
//        System.out.print("nhập số  : ");
//        int n = s.nextInt();
//        if (soNT(n)) {
//            System.out.println(n + " là số nguyên tố");
//        } else {
//            System.out.println(n + " không phải số nguyên tố");
//        }
//    }
//
//    public static boolean soNT(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//5. Tìm 100 số nguyên tố đầu tiên
// Scanner s = new Scanner(System.in);
//   int dem=0;
//   int i=2;
//   int n = 100;
//   
//        
//         while( dem < n){
//             if(soNT(i)){
//                 System.out.print(i + " ");
//                 dem++;
//             }
//             i++;
//             
//         }
//        
//        
//    }
//    public static boolean soNT(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//6. Tìm n số nguyên tố đầu tiên, n nhập từ bàn phím
//   Scanner s = new Scanner(System.in);
//   int dem=0;
//   int i=2;
//   
//        System.out.print("nhập số số nguyen tố  : ");
//        int n = s.nextInt();
//         while( dem < n){
//             if(soNT(i)){
//                 System.out.print(i + " ");
//                 dem++;
//             }
//             i++;
//             
//         }
//        
//        
//    }
//    public static boolean soNT(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//7. Tìm số nguyên tố lớn nhất nhỏ hơn n, n nhập từ bàn phím


//8. Nhập n số từ bàn phím, chỉ sắp xếp các số nguyên tố với nhau, thứ tự tăng dần, giảm dần
    }
}
