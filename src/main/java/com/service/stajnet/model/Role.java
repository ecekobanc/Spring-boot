package com.service.stajnet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public final class Role implements GrantedAuthority{
    
    private static final long serialVersionUID = 1L;

    @Id
    private String role;

    @JsonIgnore
    @Override
    public String getAuthority(){
        return role;
    }
}