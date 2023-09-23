package com.assignment.UserManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.IMessage;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    private Integer userId;

    private String userName;

    private LocalDateTime dateOfBirth;

    @Email(message = "You have to give the email in a proper format")
    private String userEmail;

    @Size(min = 13, max = 13)
    @Pattern(regexp = "\\+91\\d{10}")
    private String userPhoneNumber;


}
