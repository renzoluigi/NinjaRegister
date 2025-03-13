package dev.java10x.NinjaRegistration.ninja.domain;


import dev.java10x.NinjaRegistration.mission.domain.Mission;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_registers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The ninja name cannot be blank.")
    private String name;

    @NotBlank(message = "Email address cannot be blank.")
    private String email;

    @Min(value = 6, message = "To be a ninja, the age needs be more than 5.")
    @Max(value = 80, message = "80 years old ninjas or more cannot be registered")
    private int age;

    @Size(min = 1, message = "The missions list must be contains at least 1 mission")
    private List<Mission> missionsList;

    @ManyToOne() // Many ninjas to One mission.
    @JoinColumn(name = "missions_id")
    private Mission mission;

}
