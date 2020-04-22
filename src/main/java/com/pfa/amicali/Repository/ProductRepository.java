package com.pfa.amicali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.amicali.Entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
