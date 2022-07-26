package com.sha.springbootvideocontentmanager.service;

import com.sha.springbootvideocontentmanager.model.PurchaseHistory;
import com.sha.springbootvideocontentmanager.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {

    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
