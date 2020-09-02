package Exchange.external;

public class Owner {

    private Long ownerId;
    private String status;
    private String exchangeDate;
    private Long exchangeId;

    public Long getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getExchangeDate() {
        return exchangeDate;
    }
    public void setExchangeDate(String exchangeDate) {
        this.exchangeDate = exchangeDate;
    }
    public Long getExchangeId() {
        return exchangeId;
    }
    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }

}
