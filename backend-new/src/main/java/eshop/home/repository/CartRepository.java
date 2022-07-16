package eshop.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eshop.home.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
