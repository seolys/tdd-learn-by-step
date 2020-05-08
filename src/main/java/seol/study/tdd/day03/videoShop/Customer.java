package seol.study.tdd.day03.videoShop;

import seol.study.tdd.day03.vendingMachine.CoinSet;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int point;
    private List<Rental> rentalList = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void rental(Video video, int days) {
        this.rentalList.add(new Rental(video, days));
        this.point += video.getType().point;
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }

    public int getAblePoint() {
        return this.point;
    }

    public int getTotalPoint() {
        return rentalList
                .stream()
                .mapToInt(rental -> rental.getVideo().getType().point)
                .sum();
    }

    public int getTotalPrice() {
        return rentalList
                .stream()
                .mapToInt(Rental::getPrice)
                .sum();
    }

}
