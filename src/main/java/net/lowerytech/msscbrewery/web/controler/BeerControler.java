package net.lowerytech.msscbrewery.web.controler;

import net.lowerytech.msscbrewery.services.BeerService;
import net.lowerytech.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerControler {
    private BeerService beerService;

    public BeerControler(BeerService beerService) {
        this.beerService = beerService;
    }
    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity handlePost(BeerDto beerDto) {
        BeerDto savedDto = beerService.save(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
