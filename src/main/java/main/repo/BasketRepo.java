package main.repo;

import main.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BasketRepo extends JpaRepository<Basket, UUID> {
}
