package com.sha.springbootvideocontentmanager.controller;


import com.sha.springbootvideocontentmanager.model.PurchaseHistory;
import com.sha.springbootvideocontentmanager.security.UserPrincipal;
import com.sha.springbootvideocontentmanager.service.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history")//pre-path
public class PurchaseHistoryController {

    @Autowired
    private IPurchaseHistoryService purchaseHistoryService;


    @PostMapping//api/purchase-history
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory purchaseHistory) {
        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistory), HttpStatus.CREATED);
    }

    @GetMapping//api/purchase-history
    public ResponseEntity<?> getAllPurchaseOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok(purchaseHistoryService.findPurchasedItemsOfUser(userPrincipal.getId()));
    }
}
