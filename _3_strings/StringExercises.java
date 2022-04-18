package org.example.day4._3_strings;

public class StringExercises {
    /*
       TODO 9
       Prefix the param with 'Good job, '

       goodJob("Anna")          -> "Good job, Anna!"
       goodJob("my friend")     -> "Good job, my friend!"
       goodJob("XYZ")           -> "Good job, XYZ!"
       goodJob("Indiana Jones") -> "Good job, Indiana Jones!"

    */
    String goodJob(String name) {
        return "Good job, " + name + "!";
    }

    /*
       TODO 10
       If String is even length, return first half x2. Else return original String.

       doubleFirstHalf("HeyYou")   -> "HeyHey"
       doubleFirstHalf("12345678") -> "12341234"
       doubleFirstHalf("M")        -> "M"
       doubleFirstHalf("panda")    -> "panda"
    */
    String doubleFirstHalf(String str) {
//      If dividing length by 2 has no remainder then return the first half of the string
        if (str.length() % 2 == 0) {
            String half = str.substring(0, str.length() / 2);
            return half + half;
        }
//      Otherwise, return the original string.
        return str;

    }

    /*
        TODO 11

        interlace("A", "B")      -> "ABABA"
        interlace("Sun", "Moon") -> "SunMoonSunMoonSun"
        interlace("blue", "red") -> "blueredblueredblue"
        interlace("Hi", "Ciao")  -> "HiCiaoHiCiaoHi"
     */
    String interlace(String a, String b) {
        return a + b + a + b + a;
    }


    /*
        TODO 12

        cutEnds("Java")  -> "av"
        cutEnds("koala") -> "oal"
        cutEnds("XX")    -> ""
        cutEnds("a")     -> ""
     */
    String cutEnds(String str) {
//      If the string length is less than 2 then we return a blank string as there is nothing to remove
        if (str.length() <2 )
            return "";
//      If the string length is greater than two then we start at index 1 all the way to index -1 (index -1 is the last element)
        return (str.substring(1, str.length() - 1));
    }


    /*

       TODO 13

       addTags("smile", "i")        -> <i>smile</i>
       addTags("777666555", "phone" -> <phone>777666555</phone>
       addTags("welcome", "header"  -> <header>welcome</header>
     */
    String addTags(String word, String tag) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }


    /*

       TODO 14

       copyLastChars("computer") -> "ter ter"
       copyLastChars("ABCD")     -> "BCD BCD"
       copyLastChars("Hi")       -> "Hi Hi"
       copyLastChars("Amazing")  -> "ing ing"
     */
    String copyLastChars(String str) {
//      If the string is less than 3 characters than return the following
        if (str.length() < 3) {
            return str + " " + str;
        }
//      If the string has more than 3 characters then return the last 3 characters only
        String end = str.substring(str.length()-3);
        return end + " " + end;
    }
}

