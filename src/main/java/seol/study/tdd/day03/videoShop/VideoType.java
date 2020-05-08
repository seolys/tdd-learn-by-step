package seol.study.tdd.day03.videoShop;

public enum VideoType {
    MOVIE(1, 2, 0.5),
    SPORT(2, Integer.MAX_VALUE, 1),
    DOCUMENTARY(1, 3, 0.33)
    ;
    final int point;
    final int discountBaseDay;
    final double discountRate;

    VideoType(int point, int discountBaseDay, double discountRate) {
        this.point = point;
        this.discountBaseDay = discountBaseDay;
        this.discountRate = discountRate;
    }
}
