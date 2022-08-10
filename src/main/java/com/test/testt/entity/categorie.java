package com.test.testt.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name="categorie")
public class categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @OneToMany(mappedBy = "cat")
    List<Article> articles;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    private Integer id;
    private String libelleCetegorie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelleCetegorie() {
        return libelleCetegorie;
    }

    public void setLibelleCetegorie(String libelleCetegorie) {
        this.libelleCetegorie = libelleCetegorie;
    }

    public categorie(Integer id, String libelleCetegorie) {
        this.id = id;
        this.libelleCetegorie = libelleCetegorie;
    }

    @Override
    public String toString() {
        return "categorie{" +
                "id=" + id +
                ", libelleCetegorie='" + libelleCetegorie + '\'' +
                '}';
    }
}
