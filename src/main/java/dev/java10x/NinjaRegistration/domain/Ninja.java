package dev.java10x.NinjaRegistration.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_register")
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

    public Ninja(Long id, String name, int idade) {
        this.id = id;
        this.name = name;
        this.age = idade;
    }

    public Ninja() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAgE(int idade) {
        this.age = idade;
    }
}
