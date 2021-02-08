package racingcar.domain;

public class AttemptNumber {

    private static final int MIN_ATTEMPT_NUMBER = 1;

    private int attemptNumber;

    public AttemptNumber(int attemptNumber) {
        validateNumberRange(attemptNumber);
        this.attemptNumber = attemptNumber;
    }

    private void validateNumberRange(int attemptNumber) {
        if (attemptNumber < MIN_ATTEMPT_NUMBER) {
            throw new IllegalArgumentException("시도 횟수는 1회 이상이여야 합니다.");
        }
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }
}