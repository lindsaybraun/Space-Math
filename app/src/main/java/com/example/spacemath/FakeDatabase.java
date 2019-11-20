package com.example.spacemath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static Topic getTopicById(int topicId) {
        return topics.get(topicId);
    }


    public static ArrayList<Topic> getAllTopics() {
        return new ArrayList<Topic>((List) Arrays.asList(topics.values().toArray()));
    }

    public static final HashMap<Integer, Topic> topics = new HashMap<>();

    static{
        topics.put(1, new Topic(
        1,
        "Addition",
        "Bridging 10's",
        "Bridging through 10 is a mental Maths technique of adding two numbers whose total is greater than 10."+ "\n"  +
                "Pupils count through to 10 then add the remainder as well.",
                "For instance, when given a sum such as 9 + 7, pupils can use the bridging through ten method as follows:\n" +
                        "\n" +
                        "9 + 1 = 10 which leaves 6 remaining\n" +
                        "10 + 6 is the equivalent of 9 + 7\n" +
                        "Therefore 9 + 7 = 16",
                "There are a number of visual aids you can use with your class, as they learn to use the Bridging through 10 method and strengthen their knowledge of number bonds. ",
                    "9ZaEPeaucIU"));

        topics.put(2, new Topic(
                2,
                "Addition",
                "Combos 10&20",
                "Here students will learn the different combinations that make up 10 and 20, rainbow displays can be useful in these cases",
                "So in getting quick to answer combos of 10&20, children need practice!, they need to practice answering questions that add up to 10 and 20, so that when faced witht hese questions they will know what the answers are",
                "hopefully through watching the video and practice, kids memorize the different combinations that make up 10%20",
                "qeJ_M5AK_1k"));

        topics.put(3,new Topic(3,
                "Addition",
                "split",
                " The Break Apart or Split addition strategy breaks the numbers into their respected place value then the numbers are added together to find the sum. ",
                "Step 1:  Break apart the number into tens and ones.\n" +
                        "\n" +
                        "Step 2:  The tens are added.\n" +
                        "\n" +
                        "Step 3:  The ones are added.\n" +
                        "\n" +
                        "Step 4:  Add the tens and ones to find the sum.",
                "following these steps will help children break apart big two digit numbers and add them together quickly.",
                "74x-mrD611U"));

        topics.put(4, new Topic(4,
                "Addition",
                " Adding written Algorithm",
                "Wait! Stop! Don't run away - it's not really as bad as it sounds! I know what happened." + "\n" +
                        "You heard the word algorithm and wanted nothing more to do with this lesson. Well, algorithm is just a fancy word for talking about a process used to solve problems."  + "\n" +
                " And standard just means something that is normally used. So, putting it all together, standard algorithm for addition simply means a normally used process to solve addition problems!" + "\n" +
                        "Why can't we just say that in the first place, right?",
                "Rule 1: Line up the numbers vertically by matching the place values - and start with the ones place.\n" +
                        "\n" +
                        "To explain: When you add multi-digit numbers, the problem is typically written vertically - meaning one set of numbers is on top of the other. But, you can't just place the numbers anywhere - there is a proper placement of the numbers based upon place value. Place value is the place a number represents when a number is written in standard form. We will look at an example after we review the rest of the rules.\n" +
                        "\n" +
                        "Rule 2: Add together the numbers that share the same place value - again, start with the ones place.\n" +
                        "\n" +
                        "Rule 3: Regroup, if necessary.",
                "watch the video and practice!",
                "PpvFxOIwfbU&t=232s"));
    }
}
