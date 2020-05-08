package seol.study.tdd.day03.videoShop;

import java.util.Date;

import static seol.study.tdd.day03.videoShop.VideoType.*;

public class Rental {
    private final Video video;
    private final int days;

    public Rental(Video video, int days) {
        this.video = video;
        this.days = days;
    }

    public Video getVideo() {
        return video;
    }

    public int getDays() {
        return days;
    }

    public int getPrice() {
        Video video = getVideo();
        if (video.getType() == MOVIE) {
            return getDiscountPrice(video, days);
        } else if (video.getType() == DOCUMENTARY) {
            return getDiscountPrice(video, days);
        }
        return video.getPrice() * days;
    }

    private int getDiscountPrice(Video video, int days) {
        int price = 0;
        VideoType type = video.getType();
        if (days > type.discountBaseDay) {
            price += (days - type.discountBaseDay) * video.getPrice() * type.discountRate;
            days = type.discountBaseDay;
        }
        price += days * video.getPrice();
        return price;
    }


}
