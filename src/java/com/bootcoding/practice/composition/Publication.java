package com.bootcoding.practice.composition;

import com.bootcoding.practice.array.CompanyName;

public class Publication {
    private  String CompanyName;
    private  int since;
    private  String address;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
