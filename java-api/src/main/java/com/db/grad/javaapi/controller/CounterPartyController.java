package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.CounterParty;
import com.db.grad.javaapi.repository.CounterPartyRepository;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CounterPartyController {

    @Autowired
    private CounterPartyRepository counterPartyRepository;
    @Autowired
    private TradeRepository tradeRepository;

    // Get all counterparty entries
    @GetMapping("counterparty/all")
    public List<CounterParty> getAll() {
        return counterPartyRepository.findAll();
    }

    // Get counterparty by id
    @GetMapping("counterparty/{id}")
    public ResponseEntity<CounterParty> getById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        CounterParty result = counterPartyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Trade for id %s not found", id)));
        return ResponseEntity.ok().body(result);
    }
}
