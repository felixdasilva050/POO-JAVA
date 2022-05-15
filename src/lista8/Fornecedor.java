package lista8;

public class Fornecedor extends Pessoa{

    private Double creditValue, debtValue;

    public Fornecedor(String name, String address, String phone, Double creditValue, Double debtValue) {
        super(name, address, phone);
        this.creditValue = creditValue;
        this.debtValue = debtValue;
    }

    public Double getCreditValue() {
        return creditValue;
    }

    public Double getDebtValue() {
        return debtValue;
    }

    public Double getBalance(){
        return this.creditValue - this.debtValue;
    }

    public void setCreditValue(Double creditValue) {
        this.creditValue = creditValue;
    }

    public void setDebtValue(Double debtValue) {
        this.debtValue = debtValue;
    }
}
