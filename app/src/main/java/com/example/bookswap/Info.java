package com.example.bookswap;

public class Info {
    private String authorname;
    private String imageurl1;  //URl of author's images
    private String imageurl2;  // URL of diplay image


    public Info(String authorname,String imageurl1,String imageurl2){

        this.authorname = authorname;
        this.imageurl1 = imageurl1;
        this.imageurl2 = imageurl2;

    }

    public String getName() {
        return authorname;
    }

    public String getImageUrl1() {
        return imageurl1;
    }

    public String getImageurl2(){
        return imageurl2;
    }





}
