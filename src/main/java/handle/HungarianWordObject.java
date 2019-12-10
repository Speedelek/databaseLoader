package handle;

public class HungarianWordObject {

    Integer hungarianWordId;
    String HungarianWord;

    public HungarianWordObject(Integer hungarianWordId, String hungarianWord) {
        this.hungarianWordId = hungarianWordId;
        HungarianWord = hungarianWord;
    }

    public HungarianWordObject(){

    }

    public Integer getHungarianWordId() {
        return hungarianWordId;
    }

    public void setHungarianWordId(Integer hungarianWordId) {
        this.hungarianWordId = hungarianWordId;
    }

    public String getHungarianWord() {
        return HungarianWord;
    }

    public void setHungarianWord(String hungarianWord) {
        HungarianWord = hungarianWord;
    }
}
