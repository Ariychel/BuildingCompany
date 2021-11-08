package com.company;

public enum CompanyNames {

    DAVINCHI("Davinchi Group"),
    MALVA("Malva Building"),
    BUILDINVEST("Build Invest Group");


    private String title;

    CompanyNames(){
        this.title="";
    }
    CompanyNames(String title) {
        this.title = title;
    }

    public String getTitle(){
        return  title;
    }

    @Override
    public String toString() {
        return title;
    }
}
