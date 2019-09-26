package guru.sfg.beer.order.service.web.mappers.beer;

import guru.sfg.beer.order.service.domain.beer.Beer;
import guru.sfg.beer.order.service.web.model.beer.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}