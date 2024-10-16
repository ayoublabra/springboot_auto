package com.airbnb.airbnb.repositories;

import com.airbnb.airbnb.entities.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Long> {
}
