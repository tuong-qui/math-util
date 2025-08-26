/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuongqui.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtil {
    
    // trong class này cung cấp ra ngoài nhiều hàm xử lý toán học
    // clone class Math trong JDK
    //  thiết kế class có các hàm chỉ để xử lý cho class khác thoi chớ không lưu lại kết qua r thì đó là STATIC
    // hàm thư viện dùng chung cho ai đó ko cân lưu lại trạng thái/ giá trị --> chọn thiết kế STATIC
    
    // hàm giai thừa 
//    public static long getFactorial (int n) {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 ... 20.");
//        if ( n == 0 || n == 1)
//            return 1; 
//        long product = 1; // tích nhân dồn
//        for (int i = 2; i <= n; i++)
//            product *= i;
//        return product;
//                
//    }
    
    // RECURSION TEST
    // Đệ quy ;à hiện tượng gọi lại chính nó với 1 quy mô khác
    // ví dụ: búp bê Nga, giống nhau và lồng nhau
    // 
    
    public static long getFactorial (int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0 ... 20.");
           
        if ( n == 0 || n == 1)
            return 1; 
        
        return n * getFactorial(n - 1);
                
    }

    
}
