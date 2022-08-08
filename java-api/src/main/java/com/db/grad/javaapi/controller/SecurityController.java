package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
public class SecurityController {

    @Autowired
    private SecurityRepository securityRepository;

    @GetMapping("/security/all")
    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    @GetMapping("/security/{id}")
    public ResponseEntity<Security> getSecurityById(@PathVariable(value = "id") Long id)
        throws ResourceNotFoundException {
        Security result = securityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Security for id %s not found", id)));
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/security/add")
    public Security addSecurity(@RequestBody Security security){
        return securityRepository.saveAndFlush(security);
    }

    @PutMapping("/security/update/{id}")
    public ResponseEntity<Security> updateSecurity(@PathVariable(value = "id") Long id,
                                                   @Valid @RequestBody Security securityDetails) throws ResourceNotFoundException {
        Security security = securityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));

        security.setId(securityDetails.getId());
        security.setISIN(securityDetails.getISIN());
        security.setCUSIP(securityDetails.getCUSIP());
        security.setIssuer(securityDetails.getIssuer());
        security.setMaturityDate(securityDetails.getMaturityDate());
        security.setCoupon(securityDetails.getCoupon());
        security.setType(securityDetails.getType());
        security.setFaceValue(securityDetails.getFaceValue());
        security.setStatus(securityDetails.getStatus());

        final Security updatedSecurity = securityRepository.saveAndFlush(security);
        return ResponseEntity.ok(updatedSecurity);
    }

    @DeleteMapping("/security/delete/{id}")
    public Map< String, Boolean > deleteSecurity(@PathVariable(value = "id") Long id)
            throws Exception {
        Security security = securityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));

        securityRepository.delete(security);
        Map < String, Boolean > response = new HashMap<>();
        response.put("delete successful", Boolean.TRUE);
        return response;
    }
}
