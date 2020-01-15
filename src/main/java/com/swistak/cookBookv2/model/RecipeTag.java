package com.swistak.cookBookv2.model;


import javax.persistence.*;


@Entity
@Table(name = "recipe_tags")
public class RecipeTag {

    @Id
    @GeneratedValue
    @Column(name="recipe_tag_id",unique = true, nullable = false)
    private long id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tag_id")
    private Tag tag;

    public RecipeTag() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
