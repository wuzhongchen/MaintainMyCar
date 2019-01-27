package net.anumbrella.lkshop.model.bean;


import android.net.Uri;

public class ImageProductDataModel {
    Uri imageUri;

    public Uri getImageUri() {
        return imageUri;
    }

    public ImageProductDataModel(String  imageUri) {
        this.imageUri= Uri.parse(imageUri);
    }
}
