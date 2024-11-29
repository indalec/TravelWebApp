package dci.j24e01.TravelBlog.model;

import dci.j24e01.TravelBlog.model.User;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String country;
    private Date visitDate;
    private String thumbnailUrl;
    private String description;
    private Double latitude;
    private Double longitude;

    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private User createdBy; // Assume a 'User' entity exists for the admin user

    private Date createdAt;
    private Date updatedAt;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", visitDate=" + visitDate +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", description='" + description + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", createdBy=" + createdBy +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(id, location.id) && Objects.equals(city, location.city) && Objects.equals(country, location.country) && Objects.equals(visitDate, location.visitDate) && Objects.equals(thumbnailUrl, location.thumbnailUrl) && Objects.equals(description, location.description) && Objects.equals(latitude, location.latitude) && Objects.equals(longitude, location.longitude) && Objects.equals(createdBy, location.createdBy) && Objects.equals(createdAt, location.createdAt) && Objects.equals(updatedAt, location.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, country, visitDate, thumbnailUrl, description, latitude, longitude, createdBy, createdAt, updatedAt);
    }
}
