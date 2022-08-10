package com.test.testt.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "article")
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String libelle;
    private float prix;
    private int quantite;

    public categorie getCat() {
        return cat;
    }

    public void setCat(categorie cat) {
        this.cat = cat;
    }

    @ManyToOne
    private categorie cat ;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }

    public int getId() {
        return id;
    }

    public Article(int id, String libelle, float prix, int quantite) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
        this.quantite = quantite;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
