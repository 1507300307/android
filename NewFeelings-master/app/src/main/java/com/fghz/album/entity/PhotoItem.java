package com.fghz.album.entity;

/**
 * 相片的元素
 */

public class PhotoItem {
    private int imageId;
    private String data;
    public PhotoItem(String data) {
        this.data = data;
    }
    public String getImageId() {
        return data;
    }
}
