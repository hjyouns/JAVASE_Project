package mylab.payment.entity;

public class Payment {
    protected double amount; // 결제 금액

    public Payment(double amount) {
        this.amount = amount;
    }

    // 하위 클래스에서 재정의(Override)할 메서드
    public void processPayment() {
        System.out.println("결제를 처리합니다.");
    }
}