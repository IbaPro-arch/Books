package com.company.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
@Entity
@Table(
        name ="book"
)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private Integer id;
    private String title;
    private String author;
    private String type;
    private double price;
    private String language;
    private String isbn13;

    @OneToMany(targetEntity = Warehouse.class, cascade = CascadeType.ALL)
    @JoinColumn(name="bookid_key", referencedColumnName = "id")
    private List<Warehouse> warehouse;

}
