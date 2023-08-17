package sia.tacocloud.data.interfaces;

import sia.tacocloud.models.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
