package guru.sfg.beer.order.service.web.mappers;

import guru.sfg.beer.order.service.domain.BeerOrderLine;
import guru.sfg.beer.order.service.services.beer.BeerService;
import guru.sfg.beer.order.service.web.model.BeerOrderLineDto;
import guru.sfg.beer.order.service.web.model.beer.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public abstract class BeerOrderLineMapperDecorator implements BeerOrderLineMapper {

    private BeerService beerService;
    private BeerOrderLineMapper mapper;

    @Autowired
    private void getBeerService(BeerService beerService) {
        this.beerService = beerService;
    }

    @Autowired
    private void getMapper(BeerOrderLineMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line) {
        Optional<BeerDto> beerDto = beerService.getBeerByUpc(line.getUpc());
        BeerOrderLineDto orderLineDto = mapper.beerOrderLineToDto(line);

        beerDto.ifPresent(dto -> { orderLineDto.setBeerName(dto.getBeerName());
            orderLineDto.setBeerName(dto.getBeerName());
            orderLineDto.setBeerStyle(dto.getBeerStyle());
            orderLineDto.setUpc(line.getUpc());});
        return orderLineDto;
    }

    @Override
    public BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto) {
        return mapper.dtoToBeerOrderLine(dto);
    }
}
