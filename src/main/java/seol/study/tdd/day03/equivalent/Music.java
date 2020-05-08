package seol.study.tdd.day03.equivalent;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.Objects;

public class Music {
    private final String songName;
    private final String performerName;

    public Music(String songName, String performerName) {
        this.songName = songName;
        this.performerName = performerName;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Music music = (Music) o;
//        return Objects.equals(songName, music.songName) &&
//                Objects.equals(performerName, music.performerName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(songName, performerName);
//    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
