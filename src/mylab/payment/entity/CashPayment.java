package mylab.payment.entity;

public class CashPayment extends Payment {
    private String receiptType; // 현금영수증 유형 (개인/사업자)

    public CashPayment(double amount, String receiptType) {
        super(amount);
        this.receiptType = receiptType;
    }

    @Override
    public void processPayment() {
        System.out.println("현금 결제 완료: " + amount + "원 (영수증: " + receiptType + ")");
    }
}