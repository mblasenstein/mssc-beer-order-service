package guru.sfg.beer.order.service.web.mappers.beer;

import guru.sfg.beer.order.service.domain.beer.Beer;
import guru.sfg.beer.order.service.domain.beer.Beer.BeerBuilder;
import guru.sfg.beer.order.service.web.model.beer.BeerDto;
import guru.sfg.beer.order.service.web.model.beer.BeerDto.BeerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-25T19:32:57-0700",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.4 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        beerDto.version( beer.getVersion() );
        beerDto.createdDate( beer.getCreatedDate() );
        beerDto.lastModifiedDate( beer.getLastModifiedDate() );
        beerDto.beerName( beer.getBeerName() );
        beerDto.beerStyle( beer.getBeerStyle() );
        beerDto.upc( beer.getUpc() );
        beerDto.price( beer.getPrice() );
        beerDto.quantityOnHand( beer.getQuantityOnHand() );

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( dto.getId() );
        beer.version( dto.getVersion() );
        beer.createdDate( dto.getCreatedDate() );
        beer.lastModifiedDate( dto.getLastModifiedDate() );
        beer.beerName( dto.getBeerName() );
        beer.beerStyle( dto.getBeerStyle() );
        beer.upc( dto.getUpc() );
        beer.price( dto.getPrice() );
        beer.quantityOnHand( dto.getQuantityOnHand() );

        return beer.build();
    }
}
