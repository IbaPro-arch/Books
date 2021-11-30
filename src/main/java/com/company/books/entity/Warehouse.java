package com.company.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(
        name="warehouse"
)
public class Warehouse {

    @Id
    private Long id;
    private String make;
    private String type;
    private Integer price;
}
