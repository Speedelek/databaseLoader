package handle;

public class WordObject {


    String e_word;
    String partOfSpeech;
    String inSpeech;
    String inWriting;

    public WordObject(String word, String partOfSpeech, String inSpeech, String inWriting) {
        this.e_word = word;
        this.partOfSpeech = partOfSpeech;
        this.inSpeech = inSpeech;
        this.inWriting = inWriting;
    }

    public WordObject(){

    }

    public String getE_word() {
        return e_word;
    }

    public void setE_word(String e_word) {
        this.e_word = e_word;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getInSpeech() {
        return inSpeech;
    }

    public void setInSpeech(String inSpeech) {
        this.inSpeech = inSpeech;
    }

    public String getInWriting() {
        return inWriting;
    }

    public void setInWriting(String inWriting) {
        this.inWriting = inWriting;
    }
    }
