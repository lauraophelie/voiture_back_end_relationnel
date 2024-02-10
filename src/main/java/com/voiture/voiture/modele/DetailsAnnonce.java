package com.voiture.voiture.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "details_annonce")
public class DetailsAnnonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToOne
    @JoinColumn(name = "id_annonce")
    Annonce id_annonce;
    String image1;
    String image2;
    String image3;
    String image4;
    public DetailsAnnonce(int id, Annonce id_annonce, String image1, String image2, String image3, String image4) {
    String image1;
    String image2;
    String image3;
    String image4;  
    public DetailsAnnonce(int id, Annonce id_annonce, String image1, String image2, String image3, String image4) {
        this.id = id;
        this.id_annonce = id_annonce;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
    }
    public DetailsAnnonce() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Annonce getId_annonce() {
        return id_annonce;
    }
    public void setId_annonce(Annonce id_annonce) {
        this.id_annonce = id_annonce;
    }
    public String getImage1() {
        return image1;
    }
    public void setImage1(String image1) {
        this.image1 = image1;
    }
    public String getImage2() {
        return image2;
    }
    public void setImage2(String image2) {
        this.image2 = image2;
    }
    public String getImage3() {
        return image3;
    }
    public void setImage3(String image3) {
        this.image3 = image3;
    }
    public String getImage4() {
        return image4;
    }
    public void setImage4(String image4) {
        this.image4 = image4;
    } 
    
}
