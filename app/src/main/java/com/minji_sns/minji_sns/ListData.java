package com.minji_sns.minji_sns;

/**
 * Created by 김민지 on 2016-08-04.
 */
public class ListData {

    private String mainText;
    private String subText;
    private int imgAddress;

    public ListData(String mainText, String subText, int imgAddress) {
        this.mainText = mainText;
        this.subText = subText;
        this.imgAddress = imgAddress;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public int getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(int imgAddress) {
        this.imgAddress = imgAddress;
    }
}
