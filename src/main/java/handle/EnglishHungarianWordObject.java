package handle;

public class EnglishHungarianWordObject {

    Integer englishWordId;
    Integer hungarianWordId;
    String exampleSentence;

    public EnglishHungarianWordObject(Integer englishWordId, Integer hungarianWordId, String exampleSentence) {
        this.englishWordId = englishWordId;
        this.hungarianWordId = hungarianWordId;
        this.exampleSentence = exampleSentence;
    }

    public EnglishHungarianWordObject(){

    }

    public Integer getEnglishWordId() {
        return englishWordId;
    }

    public void setEnglishWordId(Integer englishWordId) {
        this.englishWordId = englishWordId;
    }

    public Integer getHungarianWordId() {
        return hungarianWordId;
    }

    public void setHungarianWordId(Integer hungarianWordId) {
        this.hungarianWordId = hungarianWordId;
    }

    public String getExampleSentence() {
        return exampleSentence;
    }

    public void setExampleSentence(String exampleSentence) {
        this.exampleSentence = exampleSentence;
    }
}
