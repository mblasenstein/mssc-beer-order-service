package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.domain.beer.Beer;
import guru.sfg.beer.order.service.web.model.beer.BeerDto;

public interface BeerService {
    Beer getBeerByUpc(String upc);
}
