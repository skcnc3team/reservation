package rental.external;

public class PayProcessing {

    private Long id;
    private String carId;
    private String customerNm;
    private Integer qty;
    private String reervationId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
    public String getCustomerNm() {
        return customerNm;
    }

    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getReervationId() {
        return reervationId;
    }

    public void setReervationId(String reervationId) {
        this.reervationId = reervationId;
    }

}

