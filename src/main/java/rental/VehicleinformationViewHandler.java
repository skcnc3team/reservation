package rental;

import rental.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleinformationViewHandler {


    @Autowired
    private VehicleinformationRepository vehicleinformationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCarRegistered_then_CREATE_1 (@Payload CarRegistered carRegistered) {
        try {
            if (carRegistered.isMe()) {
                // view 객체 생성
                Vehicleinformation vehicleinformation = new Vehicleinformation();
                // view 객체에 이벤트의 Value 를 set 함
                vehicleinformation.setCarId(carRegistered.getCarId());
                // view 레파지 토리에 save
                vehicleinformationRepository.save(vehicleinformation);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}