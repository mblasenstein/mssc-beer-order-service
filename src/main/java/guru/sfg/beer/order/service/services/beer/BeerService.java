package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.web.model.beer.BeerDto;

import java.util.UUID;

public interface BeerService {

    public BeerDto getBeerByUpc(String upc);
}
