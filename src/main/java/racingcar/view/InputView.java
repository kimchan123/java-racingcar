package racingcar.view;

import racingcar.utils.NameGenerator;
import racingcar.utils.TrialNumberGenerator;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner in = new Scanner(System.in);
    private static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분).";
    private static final String TRIAL_NUMBER_INPUT_MESSAGE = "시도할 회수는 몇회인가요?";

    public static List<String> getCarNames() {
        System.out.println(CAR_NAME_INPUT_MESSAGE);
        return NameGenerator.generateCarNames(in.nextLine());
    }

    public static int getTrialNumber() {
        System.out.println(TRIAL_NUMBER_INPUT_MESSAGE);
        return TrialNumberGenerator.generateTrialNumber(in.nextLine());
    }
}
