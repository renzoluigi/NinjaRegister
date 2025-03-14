package dev.java10x.NinjaRegistration.ninja.repository;

import dev.java10x.NinjaRegistration.ninja.domain.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
