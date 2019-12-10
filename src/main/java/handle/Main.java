package handle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {

        FileReader file = new FileReader("C:\\Users\\Akos\\Documents\\Szakdoga\\longman3000FromLongman.txt");
        BufferedReader reader = new BufferedReader(file);


        WordObject wordObj = new WordObject();
        ArrayList<WordObject> list = new ArrayList<WordObject>();
        String asd;
        boolean trash = true;

        HungarianWordObject hungarianWordObject = new HungarianWordObject();
        ArrayList<HungarianWordObject> listH = new ArrayList<>();

        String line = reader.readLine();
        while(line != null){
            wordObj.setE_word(line.substring(0,line.indexOf(" ")));               //WORD
            line = line.substring(line.indexOf(" ")+1,line.length());           //cut
            wordObj.setPartOfSpeech(line.substring(0,line.indexOf(" ")));       //PART_OF_SPEECH
            line = line.substring(line.indexOf(" ")+1,line.length());           //cut
            if(line.length() > 2){
                asd = line.substring(0,line.indexOf(" "));
                while(!asd.equals("S1") && !asd.equals("S2") && !asd.equals("S3") && !asd.equals("W1") && !asd.equals("W2") && !asd.equals("W3")){
                    wordObj.setPartOfSpeech(wordObj.getPartOfSpeech() + " " + asd);
                    line = line.substring(line.indexOf(" ")+1,line.length());

                    if(line.length()==2){
                        asd = line;

                    }else {
                        asd = line.substring(0,line.indexOf(" "));
                    }

                }
                if(asd.equals("S1") || asd.equals("S2") || asd.equals("S3") ){
                    if(line.length()==2){
                        wordObj.setInSpeech(line.substring(0,line.length()));
                    }else {
                        wordObj.setInSpeech(line.substring(0, line.indexOf(" ")));
                        line = line.substring(line.indexOf(" ")+1,line.length());
                        wordObj.setInWriting(line);
                    }
                }else{
                    wordObj.setInWriting(line.substring(0,line.length()));
                }
            }else{
                if(line.equals("S1") || line.equals("S2") || line.equals("S3")){
                    wordObj.setInSpeech(line);
                }else{
                    wordObj.setInWriting(line);
                }
            }

            list.add(wordObj);
            wordObj = new WordObject();
            line = reader.readLine();
        }
        list.forEach(s -> System.out.println(s.getE_word() + "    " + s.getPartOfSpeech() + "     " + s.getInSpeech() + "     " + s.getInWriting()));






        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection =connectionClass.getConnection();

        for(int i = 0 ; i < list.size(); i++) {

            String sql = "INSERT INTO ENGLISH_WORDS (english_word_id,english_word,part_of_speech,in_speech,in_writing) " +
                    "VALUES ('" + i + "','"+ list.get(i).getE_word() + "'," +
                    "'" + list.get(i).getPartOfSpeech() + "'," +
                    "'" + list.get(i).getInSpeech() + "'," +
                    "'" + list.get(i).getInWriting() + "')";

            System.out.println(sql);
            System.out.println(list.get(i).getE_word());
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }



    }
}
