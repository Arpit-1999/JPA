package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class tech {
    @Id
    private int id;
    private String name;
    private String tech_name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTech_name() {
        return tech_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTech_name(String tech_name) {
        this.tech_name = tech_name;
    }

    @Override
    public String toString() {
        return "data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech_name='" + tech_name + '\'' +
                '}';
    }
}
