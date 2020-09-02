package Exchange;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Management_table")
public class Management {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long exchangeId;
    private Long ownerId;
    private String status;

    @PostPersist
    public void onPostPersist(){
        CheckExchangeRequested checkExchangeRequested = new CheckExchangeRequested();
        BeanUtils.copyProperties(this, checkExchangeRequested);
        checkExchangeRequested.publishAfterCommit();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        Exchange.external.Owner owner = new Exchange.external.Owner();
        // mappings goes here
        ManagementApplication.applicationContext.getBean(Exchange.external.OwnerService.class)
            .checkExchange(owner);


    }

    @PostUpdate
    public void onPostUpdate(){
        ExchangeApporved exchangeApporved = new ExchangeApporved();
        BeanUtils.copyProperties(this, exchangeApporved);
        exchangeApporved.publishAfterCommit();


        ExchangeCanceled exchangeCanceled = new ExchangeCanceled();
        BeanUtils.copyProperties(this, exchangeCanceled);
        exchangeCanceled.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }
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




}
