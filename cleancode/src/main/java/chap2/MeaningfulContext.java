package chap2;

public class MeaningfulContext {

    // 통계추측(GuessStatistics)
    // 맥락이 불분명한 버전
    private static void printGuessStatistics(char candidate, int count) {
        String number;
        String verb;
        String pluralModifier;
        if (count == 0) {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        } else if (count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";
        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }

        String guessMessage = String.format("There %s %s %s %s", verb, number, candidate, pluralModifier);
        System.out.println(guessMessage);
    }

    // 맥락이 명확한 버전
    public class GuessStatisticsMessage {
        String number;
        String verb;
        String pluralModifier;

        public String make(char candidate, int count) {
            createPluralDependentMessageParts(count);
            return String.format("There %s %s %s %s", verb, number, candidate, pluralModifier);
        }

        private void createPluralDependentMessageParts(int count) {
            if (count == 0) {
                thereAreNoLetters();
            } else if (count == 1) {
                thereIsOneLetter();
            } else {
                thereAreManyLetters(count);
            }
        }

        private void thereAreNoLetters() {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        }

        private void thereIsOneLetter() {
            number = "1";
            verb = "is";
            pluralModifier = "";
        }

        private void thereAreManyLetters(int count) {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }
    }
}
