package com.londonappbrewery.destini;

public class Story {

    private int storyText;
    private int topAnswer;
    private int bottomAnswer;

    public Story(int storyText, int topAnswer, int bottomAnswer) {
        this.storyText = storyText;
        this.topAnswer = topAnswer;
        this.bottomAnswer = bottomAnswer;
    }

    public int getStoryText() {
        return storyText;
    }

    public void setStoryText(int storyText) {
        this.storyText = storyText;
    }

    public int getTopAnswer() {
        return topAnswer;
    }

    public void setTopAnswer(int topAnswer) {
        this.topAnswer = topAnswer;
    }

    public int getBottomAnswer() {
        return bottomAnswer;
    }

    public void setBottomAnswer(int bottomAnswer) {
        this.bottomAnswer = bottomAnswer;
    }
}
