//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("");
        int[] myArray = new int[100];
        String[] lat  = new String[100];

        lat[0] = "I";
        lat[1] = "II";
        lat[2] = "III";
        lat[3] = "IV";
        lat[4] = "V";
        lat[5] = "VI";
        lat[6] = "VII";
        lat[7] = "VIII";
        lat[8] = "IX";
        lat[9] = "X";
        lat[10] = "XI";
        lat[11] = "XII";
        lat[12] = "XIII";
        lat[13] = "XIV";
        lat[14] = "XV";
        lat[15] = "XVI";
        lat[16] = "XVII";
        lat[17] = "XVIII";
        lat[18] = "XIX";
        lat[19] = "XX";
        lat[20] = "XXI";
        lat[21] = "XXII";
        lat[22] = "XXIII";
        lat[23] = "XXIV";
        lat[24] = "XXV";
        lat[25] = "XXVI";
        lat[26] = "XXVII";
        lat[27] = "XXVIII";
        lat[28] = "XXIX";
        lat[29] = "XXX";
        lat[30] = "XXXI";
        lat[31] = "XXXII";
        lat[32] = "XXXIII";
        lat[33] = "XXXIV";
        lat[34] = "XXXV";
        lat[35] = "XXXVI";
        lat[36] = "XXXVII";
        lat[37] = "XXXVIII";
        lat[38] = "XXXIX";
        lat[39] = "XL";
        lat[40] = "XLI";
        lat[41] = "XLII";
        lat[42] = "XLIII";
        lat[43] = "XLIV";
        lat[44] = "XLV";
        lat[45] = "XLVI";
        lat[46] = "XLVII";
        lat[47] = "XLVIII";
        lat[48] = "XLIX";
        lat[49] = "L";
        lat[50] = "LI";
        lat[51] = "LII";
        lat[52] = "LIII";
        lat[53] = "LIV";
        lat[54] = "LV";
        lat[55] = "LVI";
        lat[56] = "LVII";
        lat[57] = "LVIII";
        lat[58] = "LIX";
        lat[59] = "LX";
        lat[60] = "LXI";
        lat[61] = "LXII";
        lat[62] = "LXIII";
        lat[63] = "LXIV";
        lat[64] = "LXV";
        lat[65] = "LXVI";
        lat[66] = "LXVII";
        lat[67] = "LXVIII";
        lat[68] = "LXIX";
        lat[69] = "LXX";
        lat[70] = "LXXI";
        lat[71] = "LXXII";
        lat[72] = "LXXIII";
        lat[73] = "LXXIV";
        lat[74] = "LXXV";
        lat[75] = "LXXVI";
        lat[76] = "LXXVII";
        lat[77] = "LXXVIII";
        lat[78] = "LXXIX";
        lat[79] = "LXXX";
        lat[80] = "LXXXI";
        lat[81] = "LXXXII";
        lat[82] = "LXXXIII";
        lat[83] = "LXXXIV";
        lat[84] = "LXXXV";
        lat[85] = "LXXXVI";
        lat[86] = "LXXXVII";
        lat[87] = "LXXXVIII";
        lat[88] = "LXXXIX";
        lat[89] = "XC";
        lat[90] = "XCI";
        lat[91] = "XCII";
        lat[92] = "XCIII";
        lat[93] = "XCIV";
        lat[94] = "XCV";
        lat[95] = "XCVI";
        lat[96] = "XCVII";
        lat[97] = "XCVIII";
        lat[98] = "XCIX";
        lat[99] = "C";


/*
        for (int i = 0; i < 100; i++) {
            myArray[i] = i+1;
            System.out.println(myArray[i]);
        }

        for (int i = 99; i > -1; i--) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(lat[i]);

        }

 */
        String[] Et = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] EtLat = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean Flag = true;

        Map<String,String> ArLat_dict = new HashMap<String,String>();
        for (int i = 0; i < lat.length; i++) {
            ArLat_dict.put(lat[i], Integer.toString(i+1));
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String s = in.nextLine();


        // String s = "I - X";

        String[] words = s.split("[+]|[-]|[*]|[/]");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
            //System.out.println(words[i]);
        }

        int flag_count_lat = 0;

        for (int i = 0; i < words.length; i++) {
            for (int y = 0; y < Et.length; y++) {
                if (words[i].equals(EtLat[y])) {
                    flag_count_lat = flag_count_lat + 1;
                }
            }
        }


        int count_words1 = 0;
        for (int i = 0; i < words.length; i++) {
            for (int y = 0; y < EtLat.length; y++) {
                if (words[i].equals(EtLat[y])) {
                    count_words1 = count_words1 + 1;
                    words[i] = ArLat_dict.get(words[i]);
                }
            }
        }
/*
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

 */

        int count_words = words.length;
        String count_bksp = new String("");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(count_bksp)) {count_words = count_words - 1;}
        }

        char[] words_char = s.toCharArray();
        String[] words_plus = {"+", "-", "/", "*"};
        List<String> words_plus_2m = new ArrayList<String>();
        for (int i = 0; i < words_char.length; i++) {
            for (int y = 0; y < words_plus.length; y++) if (String.valueOf(words_char[i]).equals(words_plus[y])){
                words_plus_2m.add(words_plus[y]);
            }
        }

        String[] words_plus_Str = new String[words_plus_2m.size()];
        words_plus_2m.toArray(words_plus_Str);

        /*
        for (int i = 0; i < words_plus_Str.length; i++) {
            System.out.println(words_plus_Str[i]);
        }

         */

        List<String> words_OnlyInt = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(count_bksp)) {
            } else {
                words_OnlyInt.add(words[i]);
            }
        }

        int flag_count = 0;

        String[] words_OnlyInt_plus = new String[words_OnlyInt.size()];
        words_OnlyInt.toArray(words_OnlyInt_plus);
        for (int i = 0; i < words_OnlyInt_plus.length; i++) {
            for (int y = 0; y < Et.length; y++) {
                if (words_OnlyInt_plus[i].equals(Et[y])) {
                    flag_count = flag_count + 1;
                }
            }
        }



        if (flag_count_lat == 0 | count_words1 == 0) {count_words1 = 2;}

        int[] words_end = new int[2];

        if (flag_count == 2) {
            words_end[0] = Integer.parseInt(words_OnlyInt_plus[0]);
            words_end[1] = Integer.parseInt(words_OnlyInt_plus[1]);
        }

        if ((words_plus_Str.length > 1) | (words_plus_Str.length < 1)) { Flag = false;}
        if (count_words != 2) { Flag = false;}
        if (count_words1 != 2) { Flag = false;}
        if (words_end[0] > 10 | words_end[0] < 1) { Flag = false;}
        if (words_end[1] > 10 | words_end[1] < 1) { Flag = false;}

        int Itog = 0;
        if (Flag == true && words_plus_Str[0] == "+") {Itog = words_end[0] + words_end[1];}
        if (Flag == true && words_plus_Str[0] == "-") {Itog = words_end[0] - words_end[1];}
        if (Flag == true && words_plus_Str[0] == "*") {Itog = words_end[0] * words_end[1];}
        if (Flag == true && words_plus_Str[0] == "/") {Itog = words_end[0] / words_end[1];}



        // Проверка условия на римские цифры и положительный итог = больше нуля
        if(flag_count_lat == 2 & Itog < 1) {Flag = false;}

        Map<String,String> ArLat_dict_contr = new HashMap<String,String>();
        for (int i = 0; i < lat.length; i++) {
            ArLat_dict_contr.put(Integer.toString(i+1), lat[i]);
        }


/*
        System.out.println("words.length: " + words.length);
        System.out.println("count_words: " + count_words);
        System.out.println(Flag);
        System.out.println("flag_count:" + flag_count);
        System.out.println("a1:" + words_end[0] + " a2:" + words_end[1] );
        System.out.println("ArLat_dict:" + ArLat_dict.get("XXI"));
 */
        String Itog_lat = Integer.toString(Itog);

        if (flag_count_lat == 2 & count_words1 == 2 && Flag == true) {System.out.println("Output: " + ArLat_dict_contr.get(Itog_lat));}
        if (flag_count_lat != 2 && Flag == true) {System.out.println("Output: " + Itog);}
        if (Flag == false) {System.out.println("Output: \nthrows Exception");}



    }
}



