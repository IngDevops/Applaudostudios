package com.appladostudios.app.modelo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.JoinColumn;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 7934215300467016689L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String username;
	@Column
	private String password;

	@Transient
	private String confirmPassword;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set roles;

	public User() {
	}

	public User(Long id) {
		this.id = id;
	} // Getters, Setters, HashCode, Equals & ToString Functions

}
