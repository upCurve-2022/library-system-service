package com.target.ready.library.system.service.LibrarySystemService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Category")
public class Category {

    @Id
    private int categoryId;
    private String categoryName;
    private int bookId;
}
