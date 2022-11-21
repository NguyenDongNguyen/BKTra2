package com.example.bktra2_firebase;

import androidx.fragment.app.Fragment;

public class Tree extends Fragment {
    String name,describe,image;

    Tree() {

    }
    public Tree(String name, String describe, String image) {
        this.name = name;
        this.describe = describe;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
