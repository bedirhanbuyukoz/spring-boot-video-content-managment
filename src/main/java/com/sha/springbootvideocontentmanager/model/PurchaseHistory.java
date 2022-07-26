package com.sha.springbootvideocontentmanager.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name="Purchase_History")

public class PurchaseHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "video_id", nullable = false)
  private Long videoId;


  @Column(name = "price", nullable = false)
  private Long price;


  @Column(name = "purchase_time", nullable = false)
  private LocalDateTime purchaseTime;

}