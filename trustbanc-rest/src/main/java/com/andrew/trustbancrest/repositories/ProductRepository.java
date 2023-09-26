package com.andrew.trustbancrest.repositories;


import com.andrew.trustbancrest.entities.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByName(String name);
    List<Product> findByNameAndDesc(String name, String desc);
    List<Product> findByPriceGreaterThan(Double price);
    List<Product>findByDescContains(String desc);
    List<Product> findByPriceBetween(Double price1, Double price2);
    List<Product> findByDescLike(String desc);
    List<Product> findByIdIn(List<Integer> ids, Pageable pageable);

    Product save(Product product);

    void deleteById(Integer id);

    @Modifying
    @Transactional
    @Query("UPDATE Product p SET p.name = :name, p.desc = :desc, p.price = :price WHERE p.id = :id")
    int updateProduct(@Param("id") Integer id, @Param("name") String name, @Param("desc") String desc, @Param("price") Double price);


}
