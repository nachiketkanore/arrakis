package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TradeController {

    @Autowired
    private TradeRepository tradeRepository;

    @Autowired
    private SecurityRepository securityRepository;

    // Get all trades
    @GetMapping("/trade/all")
    public List <Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    // Get trade by Id
    @GetMapping("/trade/{id}")
    public ResponseEntity<Trade> getTradeById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Trade result = tradeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Trade for id %s not found", id)));
        return ResponseEntity.ok().body(result);
    }

    // Retrieve security to which the trade belongs
    @GetMapping("/getsecurityfromtrade/{trade_id}")
    public ResponseEntity <Security> getSecurityfromTrade(@PathVariable(value="trade_id") Long trade_id)
            throws ResourceNotFoundException {
        Trade trade = tradeRepository.findById(trade_id)
                .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id :: " + trade_id));
        Security security = securityRepository.findById(trade.getSecurityid())
                .orElseThrow(() -> new ResourceNotFoundException("Security not found for this trade id :: " + trade_id));
        return ResponseEntity.ok().body(security);
    }

    // get all trades associated with a security
    @GetMapping("/getTradesFromSecurity/{sec_id}")
    public List<Trade> getTradeBySecurityId(@PathVariable String sec_id){
        long security_id=Long.parseLong(sec_id);
        List<Trade> trades = new ArrayList<>();
        for(Trade t: tradeRepository.findAll()){
            if(t.getSecurityid() == security_id){
                trades.add(t);
            }
        }
        return trades;
    }

    // Create a trade
    @PostMapping("/trade/add")
    public Trade addTrade(@Valid @RequestBody Trade trade) {
        return tradeRepository.saveAndFlush(trade);
    }

    // Update a trade
    @PutMapping("/trade/update/{trade_id}")
    public ResponseEntity <Trade> updateTrade(@PathVariable(value = "trade_id") long trade_id,
                                              @Valid @RequestBody Trade trade_details)
            throws ResourceNotFoundException {
        Trade trade = tradeRepository.findById(trade_id)
                .orElseThrow(() -> new ResourceNotFoundException("Trade not found for this id :: " + trade_id));
        trade.setBookid(trade_details.getBookid());
        trade.setBuysell(trade_details.getBuysell());
        trade.setCounterpartyid(trade_details.getCounterpartyid());
        trade.setPrice(trade_details.getPrice());
        trade.setQuantity(trade_details.getQuantity());
        trade.setSecurityid(trade_details.getSecurityid());
        trade.setSettlementdate(trade_details.getSettlementdate());
        trade.setStatus(trade_details.getStatus());
        trade.setTradedate(trade_details.getTradedate());

        final Trade new_trade_details = tradeRepository.save(trade);
        return ResponseEntity.ok(new_trade_details);
    }
}
