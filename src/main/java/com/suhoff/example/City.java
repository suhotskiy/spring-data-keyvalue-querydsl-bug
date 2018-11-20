package com.suhoff.example;

import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by Valeriy Suhotskiy <suhotskiy@gmail.com> on 20.11.18.
 */
@QueryEntity
public class City implements Serializable {
    @Id
    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public City setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("\"")
                .append(name)
                .append(", ")
                .append(country)
                .append("\"")
                .toString();
    }
}