package jw.io.mvcdemo.model;

public class Transaction {
    private String id;
    private String customerFirstName;
    private String getCustomerLastName;
    private String merchantName;
    private PaymentMethod paymentMethod;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getGetCustomerLastName() {
        return getCustomerLastName;
    }

    public void setGetCustomerLastName(String getCustomerLastName) {
        this.getCustomerLastName = getCustomerLastName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
