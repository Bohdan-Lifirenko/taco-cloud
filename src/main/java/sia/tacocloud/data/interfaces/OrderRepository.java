package sia.tacocloud.data.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.models.TacoOrder;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
    List<TacoOrder> readTacoOrderByDeliveryZipAndPlacedAtBetween(
        String deliveryZip,
        Date startDate,
        Date endDate
    );

    @Query("SELECT o FROM TacoOrder o where o.deliveryCity='Seattle'")
    List<TacoOrder> readOrdersDeliveredInSeattle();
}
