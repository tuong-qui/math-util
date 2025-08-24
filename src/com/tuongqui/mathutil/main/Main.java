/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuongqui.mathutil.main;

import com.tuongqui.mathutil.core.MathUtil;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        // thử nghiệm hàm tính giai thừa bằng cách đưa ra các tình huỗng sử dụng hàm trong thực tế
        // TEST CASE: là một tình huống xử dụng app, mà nó bao hàm data đầu vào cụ thể , OUTPUT đầu ra phải ứng với xử lý của hàm/ chức năng của app, dĩ nhiên dùng đầu vào để xử lý
        // kỳ vọng: hàm trả về value ứng với input
        
        long expected = 120; 
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = "+ expected + "(expected) ");
        System.out.println("5! = " + actual + "(actual)");
    }
}
