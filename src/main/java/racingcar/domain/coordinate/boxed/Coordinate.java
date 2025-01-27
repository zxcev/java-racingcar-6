package racingcar.domain.coordinate.boxed;

import java.util.Objects;
import racingcar.exception.coordinate.InvalidCoordinateException;

public final class Coordinate implements Comparable<Coordinate> {
    private static final int MIN_COORDINATE = 0;
    private int value;

    public Coordinate(final int value) {
        validateCoordinate(value);
        this.value = value;
    }

    public static Coordinate zero() {
        return new Coordinate(MIN_COORDINATE);
    }

    private static void validateCoordinate(final int coordinate) {
        if (coordinate < MIN_COORDINATE) {
            throw new InvalidCoordinateException();
        }
    }

    public void increase() {
        value++;
    }

    public int value() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Coordinate that = (Coordinate) o;
        return value == that.value;
    }

    public int subtract(final Coordinate other) {
        return value - other.value();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(final Coordinate other) {
        return value - other.value;
    }
}
