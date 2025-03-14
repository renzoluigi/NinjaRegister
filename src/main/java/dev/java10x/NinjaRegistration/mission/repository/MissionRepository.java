package dev.java10x.NinjaRegistration.mission.repository;

import dev.java10x.NinjaRegistration.mission.domain.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
