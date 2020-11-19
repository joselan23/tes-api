package com.escalab.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {
    private String id;
    private String name;
    private String gender;
    private String species;
    private String planetId;
    private String url_image;
    private String status;
    private String description;
    private String type;
    private List<Transformations> transformations;
}
