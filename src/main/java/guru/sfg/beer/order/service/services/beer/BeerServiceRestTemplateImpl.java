package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.domain.beer.Beer;
import guru.sfg.beer.order.service.web.mappers.beer.BeerMapper;
import guru.sfg.beer.order.service.web.model.beer.BeerDto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@ConfigurationProperties(prefix = "sfg.beer", ignoreUnknownFields = false)
@Service
public class BeerServiceRestTemplateImpl implements BeerService {

    private final String BEER_PATH = "/api/v1/beer/beerUpc/";

    private String beerServiceHost;
    private final RestTemplate restTemplate;

    public BeerServiceRestTemplateImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public void setBeerServiceHost(String beerServiceHost) {
        this.beerServiceHost = beerServiceHost;
    }

    @Override
    public Beer getBeerByUpc(String upc) {
        ResponseEntity<Beer> beer = restTemplate.exchange(beerServiceHost + BEER_PATH + upc, HttpMethod.GET,null, new ParameterizedTypeReference<>(){}, (Object) upc);
        return beer.getBody();
    }
}
