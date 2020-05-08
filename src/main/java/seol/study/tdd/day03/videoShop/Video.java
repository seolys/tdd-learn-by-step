package seol.study.tdd.day03.videoShop;

public class Video {
    private final VideoType type;
    private final String name;
    private final int price;

    public Video(VideoType type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public VideoType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
