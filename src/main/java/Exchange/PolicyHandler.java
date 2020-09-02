package Exchange;

import Exchange.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverExchangeApproved_StatusChange(@Payload ExchangeApproved exchangeApproved){

        if(exchangeApproved.isMe()){
            System.out.println("##### listener StatusChange : " + exchangeApproved.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverExchangeApproved_StatusChange(@Payload ExchangeApproved exchangeApproved){

        if(exchangeApproved.isMe()){
            System.out.println("##### listener StatusChange : " + exchangeApproved.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverExchangeDeclined_StatusChange(@Payload ExchangeDeclined exchangeDeclined){

        if(exchangeDeclined.isMe()){
            System.out.println("##### listener StatusChange : " + exchangeDeclined.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverExchangeRequested_RequestConfirmExchange(@Payload ExchangeRequested exchangeRequested){

        if(exchangeRequested.isMe()){
            System.out.println("##### listener RequestConfirmExchange : " + exchangeRequested.toJson());
        }
    }

}
