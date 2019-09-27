package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.web.model.beer.BeerDto;

import java.util.Optional;

public interface BeerService {

    public Optional<BeerDto> getBeerByUpc(String upc);
}
