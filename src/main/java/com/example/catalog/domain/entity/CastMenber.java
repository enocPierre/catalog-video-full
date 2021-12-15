package com.example.catalog.domain.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

enum CastMemberType {
    TYPE1(1),
    TYPE2(2);

    private Integer type;
    private final static Map values = new HashMap<>();

    private  CastMemberType(Integer type) {
        this.type = type;
    }

    static {
        for (CastMemberType type: CastMemberType.values()) {
            values.put(type.type, type);
        }
    }

    public  Integer getType() {
        return  this.type;
    }

    public static Boolean valueOf(CastMemberType type) {
        CastMemberType castMemberType = (CastMemberType) values.get(type);
        if(castMemberType == null) return false;
        return true;
    }
}

public class CastMenber extends  BaseEntity {
    private String name;
    private  CastMemberType type;

    public CastMenber() {

    }

    public CastMenber(UUID id, String name, CastMemberType type) {
        super.setId(id);
        this.setName(name);
        this.setType(type);
    }

    public CastMenber(String name, CastMemberType type) {
        super.generateUUID();
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("");
        if (name.length() == 0) throw  new IllegalArgumentException("");
        this.name = name;
    }

    public CastMemberType getType() {
        return type;
    }

    public void setType(CastMemberType type) {
        if (type == null) throw new IllegalArgumentException("");
        if(!CastMemberType.valueOf(type)) throw new IllegalArgumentException("");
        this.type = type;
    }
}
