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
                    "9QXu93ZvJC8",
                R.drawable.bridge));

        topics.put(2, new Topic(
                2,
                "Addition",
                "Combos 10&20",
                "Here students will learn the different combinations that make up 10 and 20, rainbow displays can be useful in these cases",
                "So in getting quick to answer combos of 10&20, children need practice!, they need to practice answering questions that add up to 10 and 20, so that when faced witht hese questions they will know what the answers are",
                "hopefully through watching the video and practice, kids memorize the different combinations that make up 10%20",
                "qeJ_M5AK_1k",
                R.drawable.combos));

        topics.put(3,new Topic(3,
                "Addition",
                "Split",
                " The Break Apart or Split addition strategy breaks the numbers into their respected place value then the numbers are added together to find the sum. ",
                "Step 1:  Break apart the number into tens and ones.\n" +
                        "\n" +
                        "Step 2:  The tens are added.\n" +
                        "\n" +
                        "Step 3:  The ones are added.\n" +
                        "\n" +
                        "Step 4:  Add the tens and ones to find the sum.",
                "following these steps will help children break apart big two digit numbers and add them together quickly.",
                "74x-mrD611U",
                R.drawable.split));

        topics.put(4, new Topic(4,
                "Addition",
                " Adding Algorithm",
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
                "mAvuom42NyY",
                R.drawable.addwa));

        topics.put(5, new Topic(5,
                "Subtraction",
                "Count Down",
                " Here we will be learning all the different type of subtraction strategies",
                "The count back strategy is generally used when they are taking away numbers that are less than 10. It is being\n" +
                        "able to count back ‘x’ amount to find the answer. (Always counting the first number in their heads or\n" +
                        "counting the amount of jumps they have done.)\n",
                " Count Down\n" +
                        "This strategy is counting down from the largest number to get to the smaller number to work out\n" +
                        "what the difference is. Key is to be able to count backwards by ones and being able to tell the\n" +
                        "amount counted back not just the number they reached.",
                "QhR1SEK49qM",
                R.drawable.countdown));

        topics.put(6, new Topic(6,
                "Subtraction",
                "Ten Frames",
                "This strategy is really a take-away and not think-addition. It is useful for facts\n" +
                        "where the ones digit of the whole (subtrahend) is close to the number being\n" +
                        "subtracted (minuend). For example, for 15-6, you start with the total of 15 and\n" +
                        "you are working backward using 10 as a “bridge” so 6 needs to be decomposed\n" +
                        "into 5 and 1. Then take 5 away to get to 10 and then one more to get the answer\n" +
                        "of 9.",
                "1. Start with two ten-frames to show 16, one the complete 10 frame and the\n" +
                        "other the 6 ten frame."+ "\n" + "2. Ask the students to tell you how the 7 can be decomposed to work with the\n" +
                        "ten frames we have in front of us. (If one student doesn’t see how the 7\n" +
                        "can be decomposed into 6 and 1 so that the 6 can be taken away first and\n" +
                        "then the one more to get the answer of 9, lead them to that thinking.)\n" +
                        "3. For 13, as an example, discuss what is the easiest way to think about\n" +
                        "taking off 4 counters or 5 counters. Talk about the decomposition and how\n" +
                        "that works for us.\n" +
                        "4. Repeat with other numbers between 11 and 18.",
                " The important part now is to practice using these\n" +
                        "strategies",
                "vB09HIcNzC4",
                R.drawable.tenframes));

        topics.put(7,new Topic(7,
                "Subtraction",
                "Pull Apart",
                "A two-digit number, such as 52, contains a tens place and a ones place. That is because 52 is also equal to 50 + 2. The tens place is thus the 5, since 5 * 10 = 50 and the ones place is the 2. Breaking apart numbers can help children first learning how to perform subtraction between two digit numbers. This method also ensures that the child understands what the places of a number really mean.",
                " Subtract two-digit numbers by breaking the second number down into its tens and ones. Subtract the tens from the original first number, find the answer and then subtract the ones from that answer for the final result",
                "Subtract 83 - 24 using the break apart method. Break 24 down into its parts: 20 + 4. Subtract 20 from the original number: 83 - 20 = 63. Subtract 4 from the answer: 63 - 4 = 59. Write that 59 is the final answer.",
                "GBHnS4vvobo",
                R.drawable.subtraction));

        topics.put(8, new Topic(8,
                "Subtraction",
                "Subtraction Algorithm",
                "How to subtract two digit numbers (for example 67 - 45).",
                "Place one number above the other so the tens' place digits and ones' place digits are lined up. Draw a line under the bottom number.\n" +
                        "67\n" +
                        "45\n" +
                        "---\n" +
                        "Subtract the two digits in the ones' place column. (7 - 5 = 2).\n" +
                        "67\n" +
                        "45\n" +
                        "---\n" +
                        " 2\n" +
                        "Subtract the digits in the tens' place column (6 - 4 = 2) and place the answer below the line in the tens' place column.\n" +
                        "67\n" +
                        "45\n" +
                        "---\n" +
                        "22",
                "If the ones' place digit that is being subtracted is larger than the top ones' place digit, decrease the top tens' place digit by one and increase the top ones' place value by ten before subtracting.",
                "Y6M89-6106I",
                R.drawable.subwa));

        topics.put(9, new Topic(9,
                "Multiplication",
                "Repeated Addition",
                "Repeated addition is adding equal groups together. It is also known as multiplication. If the same number is repeated then, we can write that in the form of multiplication.",
                "For example: 2 + 2 + 2 + 2 + 2\n" +
                        "\n" +
                        "Here 2 is repeated 5 times, we can write this addition as 5 × 2. \n" +
                        "\n" +
                        "Similarly, to solve a multiplication problem through repeated addition, we repetitively group and add the same number again and again to find the answer. ",
                "For Example, if there are 5 groups.\n" +
                        "\n" +
                        "There are 3 chickens in each group.\n"+
                        " Add to find the total chickens.\n" +
                        "\n" +
                        " 3 + 3 + 3 + 3 + 3 = 15\n"+
                        "so there are 15 chickens all together",
                "dpFOvoiYDaQ",
                R.drawable.repeatedaddition));

        topics.put(10, new Topic(10,
                "Multiplication",
                "Skip Counting",
                " what is skip counting?\n"+
                "Let's pretend you and three friends have started your own dog walking business. Each person created 7 flyers to hand out to neighbors to advertise the business. Knowing that each flyer goes to a different house, how many houses will the group of 4 people need to visit? We can solve this multiplication problem really quickly using skip counting, which is when you add using intervals (the distance between two numbers along a number line).",
                "So, you must find the answer to 7 flyers multiplied by 4 people. You could simply count out your 7s to find the answer: 7, 14, 21, 28.",
                "That means there are 28 flyers, and you and your friends need to visit 28 houses. The multiplication problem that you solved is 7 x 4 = 28. By skip counting your 7s four times, you found the answer to your multiplication problem, which is known as a product.",
                "ybeDUuBhEdM",
                R.drawable.skipcounting));

        topics.put(11, new Topic(11,
                "Multiplication",
                "Equal Groups",
                "Start thinking of multiplication in groups and sets!",
                "imagine having 12 ducks and being told you had to divide them up into equal groups, how would you do this?\n"+
                "well think about it, how many groups can you make? let's say you can make 3 groups, how many ducks would go into one group?\n"+
                "the answer is 3 ducks, which means to divide 12 ducks up into equal groups we just did 4 equals groups of 3!",
                "It also helps to draw it up and circle the groups! ",
                "RNxwasijbAo",
                R.drawable.equalgroups));

        topics.put(12, new Topic(12,
                "Multiplication",
                "Multiplication Algorithm",
                "To multiply large numbers, stack the first number on top of the second. Then multiply each digit of the bottom number, from right to left, by the top number. In other words, first multiply the top number by the ones digit of the bottom number. Then write down a 0 as a placeholder and multiply the top number by the tens digit of the bottom number.",
                "When the result is a two-digit number, write down the ones digit and carry the tens digit to the next column. After multiplying the next two digits, add the number you carried over.\n" +
                        "\n" +
                        "Add the products to obtain the final answer.",
                "Sample question \n"+
                "Multiply 742 x 136.\n"+ "Stack the first number on top of the second, by aligning the ones places\n"+
                "Now multiply 6 by every number in 742, starting from the right. Because 2 x 6 = 12, a two-digit number, you write down the 2 and carry the 1 to the tens column. In the next column, you multiply 4 x 6 = 24, and add the 1 you carried over, giving you a total of 25.\n" +
                        "\n" +
                        "Write down the 5, and carry the 2 to the hundreds column. Multiply 7 x 6 = 42, and add the 2 you carried over, giving you 44:\n"+
                "Next, write down a 0 in the ones place in the next row. Multiply 3 by every number in 742, starting from the right and carrying when necessary\n"+
                "Write down two 0s as placeholders for the ones and tens place in the next row. Repeat the process with 1,To finish, add up the products",
                "FJ5qLWP3Fqo",
                R.drawable.mulwa));

        topics.put(13, new Topic(13,
                "Division",
                " Fact Families",
                "Fact family: It is a set of four related multiplication and division facts that use the same three numbers.",
                "For example: The fact family for 3, 8 and 24 is a set of four multiplication and division facts. Two are multiplication facts, whereas the other two are division facts.",
                "\n" +
                        "3\t×\t8\t=\t24\n" +
                        "8\t×\t3\t=\t24\n" +
                        "24\t÷\t3\t=\t8\n" +
                        "24\t÷\t8\t=\t3",
                "-JFcesiUTpw",
                R.drawable.factfamily));

        topics.put(14, new Topic(14,
                "Division",
                "Skip Counting",
                "Skip counting is often called counting by 2s or by 5s or by 10s or by 100s. Skip counting really helps with addition, subtraction, multiplication, and division. It is also used a lot for counting things – counting pairs of gloves, groups of five, money, boxes with 100 cans in each box – the list goes on!",
                "To skip count you add the same number over and over.\n" +
                        "\n" +
                        "You can start at any number. When you count normally (like 1,2,3,4,5,6) you add 1 to get the next number. To count by 2s, you add 2 to get the next number.",
                "now for divsion instead of skip counting up like we do in multiplication ou skip count down\n"+
                "for example when given 25 ÷ 5, we skip count 25 down by 5, 5 times, so here we go! 25, 20, 15, 10, 5\n"+
                "so the answer is 5!",
                "rGMecZ_aERo",
                R.drawable.skipcounting));

        topics.put(15, new Topic(15,
                "Division",
                "Remainder Concept",
                "Imagine you are entertaining a group of 14 people. You have 50 muffin appetizers, and you want to serve each individual the same number of muffins. You line up 14 plates and begin to distribute the muffins, one at a time. After filling each of the 14 plates with 3 muffins a piece, you realize that you don't have enough muffins left for another round, so the 8 muffins are extras, or remainders.",
                "The scenario just described is a division problem. We divided 50 by 14 and found that 14 goes into 50 exactly 3 times with 8 left over: 50 /14 = 3 R8. In this problem, the number 50 is the dividend, or the figure we want to divide up; 14 is the divisor, or the number we are dividing by. The quotient is how many times the divisor fits into the dividend, in this case, 3. Lastly, the remainder is what's left over, or 8.",
                "The remainder of a division problem is an interesting part of the problem. To find the remainder of a division problem, we can use long division of numbers.",
                "DCAr_Uk04Kw",
                R.drawable.remaindercon));

        topics.put(16, new Topic(16,
                "Division",
                "Divsion Algorithm",
                "The long division method involves basic math operations. \n" +
                        "To divide two numbers using this method, a tableau is drawn. The divisor is written outside the right paranthesis , while the dividend is placed within. The quotient is written above the over bar on top of the dividend.",
                "Long division involves 5 steps:\n" +
                        "\n" +
                        " D-\t Divide\n" +
                        " M-\t Multiply\n" +
                        " S- \t Subtract\n" +
                        " B-\t Bring down\n" +
                        " R-\t Repeat or Remainder",
                "The process begins with dividing or finding how many times the leftmost digit of the dividend can be divided by the divisor. \n" +
                        "Then, the result or answer from step 1, which becomes the first digit of the quotient, is multiplied by the divisor and written under the first digit of the dividend. \n" +
                        "Subtraction is carried out on the first digit of the dividend and the remainder is written. \n" +
                        "The next digit of the dividend is brought down and then, the process is repeated until all the digits of the dividend are brought down and a remainder is found. ",
                "HdU_rf7eMTI",
                R.drawable.divwa));



    }
}
