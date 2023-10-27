package racingcar.view;

import racingcar.component.ComponentWriter;
import racingcar.component.out.GameResultComponent;
import racingcar.component.out.RoundResultComponent;
import racingcar.domain.car.dto.response.CarsRacingDto;
import racingcar.domain.game.CarsFinishedDto;

public final class OutputView {
    private final ComponentWriter componentWriter;

    public OutputView(final ComponentWriter componentWriter) {
        this.componentWriter = componentWriter;
    }

    public void printRoundResult(final CarsRacingDto dto) {
        componentWriter.write(new RoundResultComponent(dto));
    }

    public void printGameResult(final CarsFinishedDto dto) {
        componentWriter.write(new GameResultComponent(dto));
    }
}
