package backend.example.carvajal.services;

import java.util.ArrayList;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.example.carvajal.models.Card;
import backend.example.carvajal.repositories.CardRepository;

@Service
public class cardService {
    @Autowired
    CardRepository cardRepo;

    public ArrayList<Card> getAllCards() {
        return (ArrayList<Card>) cardRepo.findAll();
    }

    public Card saveCard(Card card) {
        return cardRepo.save(card);
    }

    public boolean deleteCard(int cardId) {
        try {
            cardRepo.deleteById(cardId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
    @Transactional
    public Optional<Card> updateCard(Card card) {
        return cardRepo.findById(card.getCardId()).map(target -> {
            target.setCardNumber(card.getCardNumber());
            target.setExpirationDate(card.getExpirationDate());
            target.setCv(card.getCv());
            return target;
        });
    }
}
