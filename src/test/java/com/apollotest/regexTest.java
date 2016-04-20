package com.apollotest;

/**
 * Created by roy on 2016/4/15.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest
{
    public static void main( String args[] ){

      // String to be scanned to find the pattern.
      String line = "This order was placed for QT3000! OK?";
      String pattern = ".+?(o.+?r).+";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);


      // Now create matcher object.
      Matcher m = r.matcher(line);

      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
          System.out.println("Found value: " + m.group(1) );
      } else {
         System.out.println("NO MATCH");
      }
   }
}
