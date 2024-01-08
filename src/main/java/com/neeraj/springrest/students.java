package com.neeraj.springrest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class students {
    @Id
    int uid;
    String name;

    


    public students() {
    }


    public students(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }


    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "students [uid=" + uid + ", name=" + name + "]";
    }
    

    

}
