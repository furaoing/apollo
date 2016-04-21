package com.apollo.common.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;

/**
 * Created by roy on 2016/4/21.
 */
public class regexEx {
    public static List<List<String>> findall(Matcher m) {
        List<List<String>> matches = new LinkedList<>();

        while (m.find() && m.groupCount() > 0) {
            List<String> match = new LinkedList<>();
            int group_index = 0;
            for (int i = 0; i < m.groupCount(); i++) {
                group_index = i + 1;
                match.add(m.group(group_index));
            }
            matches.add(match);
        }
        return matches;
    }
}


