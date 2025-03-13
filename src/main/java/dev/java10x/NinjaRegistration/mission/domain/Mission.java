package dev.java10x.NinjaRegistration.mission.domain;

import dev.java10x.NinjaRegistration.ninja.domain.Ninja;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb.missions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMission;

    @NotBlank(message = "Name of mission cannot be blank.")
    private String name;

    private boolean completed;

    @NotBlank(message = "Difficult cannot be blank.")
    private char difficult;

    @OneToMany(mappedBy = "mission") // One Mission to Many ninjas
    private List<Ninja> ninjas;

}
