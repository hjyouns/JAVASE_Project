package mylab.payment.control;

import mylab.payment.entity.Payment;
import mylab.payment.entity.CreditCardPayment;
import mylab.payment.entity.CashPayment;

public class PaymentTest {
    public static void main(String[] args) {
        // 다형성 활용: 부모 타입 배열에 서로 다른 자식 객체를 담음
        Payment[] payments = new Payment[2];
        payments[0] = new CreditCardPayment(50000, "1234-5678-****");
        payments[1] = new CashPayment(30000, "개인소득공제");

        System.out.println("--- 결제 시스템 가동 ---");
        for (Payment p : payments) {
            // 각 객체의 실제 타입에 맞는 processPayment()가 자동 호출됨 (동적 바인딩)
            p.processPayment();
        }
    }
}