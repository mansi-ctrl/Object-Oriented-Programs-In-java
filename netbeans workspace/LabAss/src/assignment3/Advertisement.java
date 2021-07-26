/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
/*
Name:Mansi Dobariya
AU1841131

*/

/**
 *
 * @author mansi
 */
class Advertisement {

    int fixedFee = 200;

    public Advertisement() {
    }

}

class Hoarding extends Advertisement {

    int days, rent, cost;

    public Hoarding(int days, int rent) {
        this.days = days;
        this.rent = rent;
    }

    public void Cost() {
        cost = fixedFee + days * rent;
    }

    @Override
    public String toString() {
        return "Hoarding{" + "days=" + days + ", rent=" + rent + ", cost=" + cost + '}';
    }
}

class NewspaperAd extends Advertisement {

    int cmn, rs, cost;

    public NewspaperAd(int cmn, int rs) {
        this.cmn = cmn;
        this.rs = rs;
    }

    public void Cost() {
        cost = fixedFee + cmn * rs;
    }

    @Override
    public String toString() {
        return "NewspaperAd{" + "cmn=" + cmn + ", rs=" + rs + ", cost=" + cost + '}';
    }

}

class AdvertisementTest {

    public static void main(String[] args) {
        //Advertisement object;
        NewspaperAd n = new NewspaperAd(500, 15);
        n.Cost();
        System.out.println(n.toString());
        Hoarding h = new Hoarding(30, 400);
        h.Cost();
        System.out.println(h.toString());

    }
}
/*
mansi
run:
NewspaperAd{cmn=500, rs=15, cost=7700}
Hoarding{days=30, rent=400, cost=12200}
BUILD SUCCESSFUL (total time: 2 seconds)

*/