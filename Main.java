import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        Languages lang=Languages.en;
        

        switch (lang) {
            case en:
                System.out.println(Arrays.toString(Languages.values()));
                break;
        
            default:
                break;
        }


        System.out.println(english());
        System.out.println(russian());
        System.err.println(georgian());
        System.out.println(words_generator(10, 30));
        System.out.println(Sentences_generator(10, 20));
}

    
    public static ArrayList<String> english(){
        ArrayList<String> result = new ArrayList<String>();
        char c;
        for(c='A'; c<='Z'; ++c){
            String str=String.valueOf(c);
            result.add(str);
        }
        return result;
    }

    public static ArrayList<String> russian(){
        ArrayList<String> result = new ArrayList<String>();
        char S = 'А', C = 'Я';
        for (char i = S; i <= C; i++) {
            String str=String.valueOf(i);
            result.add(str);
        }
        return result;
    }

    public static ArrayList<String> georgian(){
        ArrayList<String> result = new ArrayList<String>();
        char S = 'ა', C = 'ჰ';
        for (char i = S; i <= C; i++) {
            String str=String.valueOf(i);
            result.add(str);
        }
        return result;
    }

    public static String words_generator(int min, int max){
        Random r=new Random();
        int minimum=min;
        int maximum=max;
        String str="";
        int random_number=r.nextInt(maximum-minimum)+1;
        for(int i=random_number; i>=0; i--){
           int rand=r.nextInt(english().size()-1);
           String letters=english().get(rand);
           str+=letters;
        }
        
        
        return  str;
    }

    public static String Sentences_generator(int min, int max){
        Random r=new Random();
        int minimum=min;
        int maximum=max;
        int random_number=r.nextInt(maximum-minimum)+1;
        StringBuffer str=new StringBuffer();
        for (int i=random_number; i>=0; i--){
            int rand_num=r.nextInt(english().size()-1-1)+1;
            String words=words_generator(0, english().size()-1);
            str.append(words);
            str.append("    ");
            // System.out.println(str);
        }
        
        return  "წინადადება არის -> " +str.toString();
    }
   
}
