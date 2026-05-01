package co.simplon.jpalibrary.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class BookEntity {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 @Column (length = 100)
 @Nonnull
 private String title;

 @Column
 private String description;

 @Column
 private Boolean available = true;

 public BookEntity() {
 }

 public BookEntity(String title, String description) {
  this.title = title;
  this.description = description;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public Boolean getAvailable() {
  return available;
 }

 public void setAvailable(Boolean available) {
  this.available = available;
 }

 @Override
 public String toString() {
    return "BookEntity [id=" + id + ", title=" + title + ", description=" + description + ", available=" + available
            + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription()
            + ", toString()=" + super.toString() + "]";
 }

}
