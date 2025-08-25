/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuongqui.mathutil.test.core;

import com.tuongqui.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    // Đây là class sẽ sử dụng các hàm cuat thư viện/ framework JUnit để kiểm tra code chính - hàm tinhGiaiThua() bên class core.MathUtil
    // viết code để test code chính bên kia 
    
    // có nhiều quy tắc đặt tên hàm kiểm thử
    // nhưng thưỡng sẽ nói lên mục đích của các case
    // tình huoonhx xài hàm theo kiểu thành công và thất bại
    
    // hàm tính giai thừa là tính huống test thành công - hàm kiểu well
    
    // @Test JUnit sẽ phối hợp với JVM để chạy hàm này
    // @Test phía hậy truownhf chính là publoc static void main()
    // có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    
    
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        int n = 0; 
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        
        // so sánh expected với actual dùng framework 
        Assert.assertEquals(expected, actual);
        
        // gộp thêm vài case thành công 
        Assert.assertEquals(1, MathUtil.getFactorial(n)); // tôi mún 1! = 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));// tôi mún 2! = 2
        Assert.assertEquals(6, MathUtil.getFactorial(3));// tôi mún 3! = 6
        Assert.assertEquals(24, MathUtil.getFactorial(4));// tôi mún 4! = 24
        Assert.assertEquals(120, MathUtil.getFactorial(5));// tôi mún 5! = 120
        Assert.assertEquals(720, MathUtil.getFactorial(6));// tôi mún 6! = 720
                
    } // hàm giúp so sánh 2 giá trị có giống nhau hay không
    // nếu giống thì thảy ra màu xanh, nếu khác nhau thì thảy ra màu đỏ
    
    
    // hàn getF() có 2 tình huống:
    // 1. đưa data tử tế trong [0...20] -> tình huỗng đúng đc n! 
    //2. đưa data sai: âm, > 20 -> thiết kế của hàm thiết kế ra ngoại lệ thì hàm chạy đúng như thiết kế
    
    // kiểm tra ngoại lệ: ko thể so sánh value mà chỉ có thể đo bằng cách chúng có xuất hiện hay ko
    // Test case: input: -5, expected: IllegalArgumentExxception xuất hiện
    //AssertEqual(): bằng nhau trên value
    // 
    
    
    // hàm có ném ra ngoại lệ nhưng ngoại lệ klhoong như kỳ vọng chớ không phải hàm ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsExxception(){
//        MathUtil.getFactorial(-5); // hàm @Test
//        
//    }
    
    
    
        @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsExxception(){
        MathUtil.getFactorial(-5); 
    }
    
    // Cách khác để bắt ngoại lệ xuất hiện, viets tự nhiên hơn bằng cách dùng LAMBDA
//    @Test
//    public void testGetFactorialGivenWrongArgumentThrowsExxception_LambdaVersion(){
//        //Assert.assertThrows
//        //AssertThrows(tham số 1: loại ngoại lệ muốn so sánh, tham số 2: đoạn code chạy văng ra ngoại lệ)
//       // Assert.assertThrows(IllegalArgumentExxception.class, () -> MathUtil.ghetFactorial(-5));
//        MathUtil.getFactorial(-5); 
//    }
    
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsExxception_TryCatch(){
        // chủ động kiểm soát ngoại lệ 
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            // bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko
            Assert.assertEquals("Invalid argument. N must be between 0 ... 20.", e.getMessage());
        }
         
    }
    
    
    
}
