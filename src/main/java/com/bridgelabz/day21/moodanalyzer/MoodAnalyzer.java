package com.bridgelabz.day21.moodanalyzer;

public class MoodAnalyzer {

    private String msg;

    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if (msg.contains("Sad")) {
                return "Sad";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
