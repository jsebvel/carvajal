package backend.example.carvajal.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.example.carvajal.exceptions.ValidationException;
import backend.example.carvajal.models.Card;
import backend.example.carvajal.services.cardService;

@RestController
@RequestMapping("/card")
public class cardController {
    @Autowired
    cardService cardService;

    @GetMapping()
    public ArrayList<Card> getAllCards() {
        return (ArrayList<Card>) cardService.getAllCards();
    }

    @PostMapping()
    public Card saveCard(@RequestBody Card cardInfo) {
        try {
            return cardService.saveCard(cardInfo);
        } catch (Exception e) {
            throw new ValidationException(e.toString());
        }
    }

    @PostMapping()
    @RequestMapping("/updateCard")
    public Optional<Card> updateCard(@RequestBody Card cardInfo) {
        try {
            return cardService.updateCard(cardInfo);
        } catch (Exception e) {
            throw new ValidationException(e.toString());
        }
    }

    @DeleteMapping(path = "/{cardId}")
    public Boolean deleteCardById(@PathVariable("cardId") int cardId) {
        boolean ok;
        try {
            ok = this.cardService.deleteCard(cardId);
            return ok;
        } catch (Exception e) {
            throw new ValidationException(e.toString());
        }
    }
}
