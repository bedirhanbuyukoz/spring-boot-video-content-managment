package com.sha.springbootvideocontentmanager.repository;

import com.sha.springbootvideocontentmanager.model.PurchaseHistory;
import com.sha.springbootvideocontentmanager.repository.projection.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long> {

    @Query("select " +
            "v.title as title, ph.price as price, ph.purchaseTime as purchaseTime " +
            "from PurchaseHistory ph left join Video v on v.id= ph.videoId " +
            "where ph.userId= :userId")
    List<IPurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);


}
