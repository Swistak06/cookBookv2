package com.swistak.cookBookv2.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    @Column(name="user_id", unique = true, nullable = false)
    private long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    private String password;
    private Calendar registrationDate;
    private boolean isExpired;
    private boolean isLocked;
    private boolean isEnabled;

    //    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //    private Set<UserRole> userRoles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Recipe> recipes = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RecipeRate> recipeRates = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RecipePreparation> recipeLikes = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RecipePreparation> recipePreparations = new HashSet<>();

    @OneToMany(mappedBy = "commentingUser", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RecipeComment> recipeComments = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RecipeSave> recipeSaves = new HashSet<>();

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Set<RecipeRate> getRecipeRates() {
        return recipeRates;
    }

    public void setRecipeRates(Set<RecipeRate> recipeRates) {
        this.recipeRates = recipeRates;
    }

    public Set<RecipePreparation> getRecipeLikes() {
        return recipeLikes;
    }

    public void setRecipeLikes(Set<RecipePreparation> recipeLikes) {
        this.recipeLikes = recipeLikes;
    }

    public Set<RecipePreparation> getRecipePreparations() {
        return recipePreparations;
    }

    public void setRecipePreparations(Set<RecipePreparation> recipePreparations) {
        this.recipePreparations = recipePreparations;
    }

    public Set<RecipeComment> getRecipeComments() {
        return recipeComments;
    }

    public void setRecipeComments(Set<RecipeComment> recipeComments) {
        this.recipeComments = recipeComments;
    }

    public Set<RecipeSave> getRecipeSaves() {
        return recipeSaves;
    }

    public void setRecipeSaves(Set<RecipeSave> recipeSaves) {
        this.recipeSaves = recipeSaves;
    }
}
