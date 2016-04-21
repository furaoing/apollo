package com.apollotest;

/**
 * Created by roy on 2016/4/15.
 */
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.apollo.common.utils.regexEx;

public class RegexTest
{
    public static void main( String args[] ){

      // String to be scanned to find the pattern.
      String line = "我的1999年10月21日之旅我的1998年11月22日之旅";
      String pattern = "(\\d{4})年(\\d{1,2})月(\\d{1,2})日.*?之旅";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      List<List<String>> matches = regexEx.findall(m);
        int a = 1;
   }
}
