
package Exchange;

public class ExchangeApporved extends AbstractEvent {

    private Long id;
    private Long ExchangeID;
    private Long OwnerID;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getExchangeId() {
        return ExchangeID;
    }

    public void setExchangeId(Long ExchangeID) {
        this.ExchangeID = ExchangeID;
    }
    public Long getOwnerId() {
        return OwnerID;
    }

    public void setOwnerId(Long OwnerID) {
        this.OwnerID = OwnerID;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
