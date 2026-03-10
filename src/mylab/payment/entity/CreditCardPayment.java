package mylab.payment.entity;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount); // 부모 생성자 호출
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("신용카드 결제 완료: " + amount + "원 (카드번호: " + cardNumber + ")");
    }
}