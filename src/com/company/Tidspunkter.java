package com.company;


import java.util.Date;

public class Tidspunkter {

    private Date bestillingTid;


    public Tidspunkter (Date _bestillingTid){
        this.bestillingTid = _bestillingTid;
    }


    public Date getBestillingTid() {
        return bestillingTid;
    }


    public void setBestillingTid(Date bestillingTid) {
        this.bestillingTid = bestillingTid;
    }


    @Override
    public String toString() {
        return "Tidspunkter{" +
                "bestillingTid=" + bestillingTid +
                '}';
    }
}

