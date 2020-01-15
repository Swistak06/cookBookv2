package com.swistak.cookBookv2.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tags")
public class Tag {

    @Id
    @GeneratedValue
    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "tag", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RecipeTag> recipeTags = new HashSet<>();

    public Tag() {
    }

    public Set<RecipeTag> getRecipeTags() {
        return recipeTags;
    }

    public void setRecipeTags(Set<RecipeTag> recipeTags) {
        this.recipeTags = recipeTags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
