package racingcar.domain.car;

import racingcar.domain.car.boxed.CarName;
import racingcar.domain.car.dto.output.WinnerDto;
import racingcar.domain.coordinate.boxed.Coordinate;

public final class CarFinished extends Car implements Comparable<CarFinished> {

    public CarFinished(
            final CarName carName,
            final Coordinate coordinate
    ) {
        super(carName, coordinate);
    }


    public boolean isAtSameCoordinate(final Car other) {
        return coordinate.equals(other.coordinate);
    }

    public WinnerDto toWinnerDto() {
        return new WinnerDto(carName.carName());
    }

    @Override
    public int compareTo(final CarFinished other) {
        return coordinate.compareTo(other.coordinate);
    }
}
