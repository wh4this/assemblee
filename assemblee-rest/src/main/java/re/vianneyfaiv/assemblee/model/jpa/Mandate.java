package re.vianneyfaiv.assemblee.model.jpa;

import re.vianneyfaiv.assemblee.model.pojo.PoliticalBodyType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "mandats")
public class Mandate {

    @Id
    @Column(name = "mandat_id")
    private String id;

    /*
    That works but that slows down the loading because of the SQL join

    @ManyToOne
    @JoinColumn(
            name = "acteur_id",
            foreignKey = @ForeignKey(name = "mandats_acteur_id_fkey")
    )*/
    @Column(name = "acteur_id")
    private String personId;

    @Column(name = "dateDebut")
    private Date startDate;

    @Column(name = "datePriseFonction")
    private Date workStartDate;

    @Column(name = "dateFin")
    private Date endDate;

    @Column(name = "numPlaceHemicycle")
    private int seatNumber;

    private String cause;

    public String getId() {
        return id;
    }

    public String getPersonId() {
        return personId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getWorkStartDate() {
        return workStartDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getCause() {
        return cause;
    }

    @Override
    public String toString() {
        return "Mandate{" +
                "id='" + id + '\'' +
                ", personId=" + personId +
                ", startDate=" + startDate +
                ", workStartDate=" + workStartDate +
                ", endDate=" + endDate +
                ", seatNumber=" + seatNumber +
                ", cause='" + cause + '\'' +
                '}';
    }
}