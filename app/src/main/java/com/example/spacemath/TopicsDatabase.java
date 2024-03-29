package com.example.spacemath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// database of all the topic information
public class TopicsDatabase {

    public static Topic getTopicById(int topicId) {
        return topics.get(topicId);
    }


    public static ArrayList<Topic> getAllTopics() {
        return new ArrayList<Topic>((List) Arrays.asList(topics.values().toArray()));
    }

    public static final HashMap<Integer, Topic> topics = new HashMap<>();

    static{
        //material referenced from https://www.twinkl.com.au/teaching-wiki/bridging-through-10
        topics.put(1, new Topic(
        1,
        "Addition",
        "Bridging 10's",
        "Bridging through 10 is a mental Maths technique of adding two numbers whose total is greater than 10."+ "\n"  +
                "You count through to 10 then add the remainder as well.",
                "For instance, when given a sum such as 9 + 7, you can use the bridging through ten method as follows:\n" +
                        "\n" +
                        "9 + 1 = 10 which leaves 6 remaining\n" +
                        "10 + 6 is the equivalent of 9 + 7\n" +
                        "Therefore 9 + 7 = 16",
                "There are a number of visual aids you can use as you learn to use the Bridging through 10 method and strengthen your knowledge of number bonds. ",
                    "9QXu93ZvJC8",
                R.drawable.bridge));

        // this material was made by us
        topics.put(2, new Topic(
                2,
                "Addition",
                "Combos 10&20",
                "Here you will learn the different combinations that make up 10 and 20. Rainbow displays can be useful in these cases",
                "So, in getting quick to answer combos of 10&20, you need practice! You need to practice answering questions that add up to 10 and 20 so that when faced with these questions you will know what the answers are.",
                "Hopefully through watching the video and practice, you memorize the different combinations that make up 10&20.",
                "qeJ_M5AK_1k",
                R.drawable.combos));

        //this material was referenced from http://www.manana.k12.hi.us/~iriss/A1_Site/Math/Entries/2015/8/11_Break_Apart_addition_strategy.html
        topics.put(3,new Topic(3,
                "Addition",
                "Split",
                "The Break Apart or Split addition strategy breaks the numbers into their respected place value. Next, the numbers are added together to find the sum.",
                "Step 1:  Break apart the number into tens and ones.\n" +
                        "\n" +
                        "Step 2:  The tens are added.\n" +
                        "\n" +
                        "Step 3:  The ones are added.\n" +
                        "\n" +
                        "Step 4:  Add the tens and ones to find the sum.",
                "Following these steps will help you break apart big two digit numbers and add them together quickly.",
                "74x-mrD611U",
                R.drawable.split));

        // this material was referenced from https://study.com/academy/lesson/standard-algorithm-for-addition.html
        topics.put(4, new Topic(4,
                "Addition",
                " Adding Algorithm",
                "Wait! Stop! Don't run away - it's not really as bad as it sounds! " +
                        "I know what happened. You heard the word algorithm and wanted nothing more to do with this lesson. Well, algorithm is just a fancy word for talking about a process used to solve problems."  + "\n" + "\n" +
                "Standard just means something that is normally used. So, putting it all together, standard algorithm for addition simply means a normally used process to solve addition problems! " +
                        "Why can't we just say that in the first place, right?",
                "Rule 1: Line up the numbers vertically by matching the place values - and start with the ones place.\n" +
                        "\n" +
                        "To explain: When you add multi-digit numbers, the problem is typically written vertically - meaning one set of numbers is on top of the other. But, you can't just place the numbers anywhere - there is a proper placement of the numbers based upon place value. Place value is the place a number represents when a number is written in standard form. We will look at an example after we review the rest of the rules.\n" +
                        "\n" +
                        "Rule 2: Add together the numbers that share the same place value - again, start with the ones place.\n" +
                        "\n" +
                        "Rule 3: Regroup, if necessary.",
                "Watch the video and practice!",
                "mAvuom42NyY",
                R.drawable.addwa));

        //this material was referenced from http://www.portmelb.vic.edu.au/wp-content/uploads/Subraction-Strategies.pdf
        topics.put(5, new Topic(5,
                "Subtraction",
                "Count Down",
                "Here, you will be learning all the different types of subtraction strategies.",
                "The count down strategy is generally used when you are taking away numbers that are less than 10. It is being " +
                        "able to count back ‘x’ amount to find the answer. (Always counting the first number in you head or " +
                        "counting the amount of jumps you have done.)\n",
                "This strategy is counting down from the larger number to the smaller number to work out " +
                        "what the difference is. The key is to count backwards by ones and be able to tell the " +
                        "amount counted back, not just the number you reached.",
                "QhR1SEK49qM",
                R.drawable.countdown));

        //this material is referenced from https://community.ksde.org/LinkClick.aspx?fileticket=n2ZHaEprrfs%3D&tabid=6036&mid=14879
        topics.put(6, new Topic(6,
                "Subtraction",
                "Ten Frames",
                "This strategy is really a take-away and not think-addition. It is useful for facts " +
                        "where the ones digit of the whole (subtrahend) is close to the number being " +
                        "subtracted (minuend)." + "\n",
                "Example: 15 - 6 \n" + "You start with the total of 15 and " +
        "work backwards using 10 as a “bridge”. So, 6 needs to be decomposed " +
                "into 5 and 1. Then, take 5 away to get to 10 and 1 away to get to the answer " +
                "of 9.",
                "The important part now is to practice using these " +
                        "strategies",
                "vB09HIcNzC4",
                R.drawable.tenframes));

        //this material was referenced from https://sciencing.com/break-apart-numbers-subtracting-8761075.html
        topics.put(7,new Topic(7,
                "Subtraction",
                "Pull Apart",
                "A two-digit number, such as 52, contains a tens place and a ones place. That is because 52 is also equal to 50 + 2." +  " The tens place is thus the 5, since 5 x 10 = 50 and the ones place is the 2, since 2 x 1 = 2." +"\n" +"Breaking apart numbers can help you to perform subtraction between two digit numbers. This method also ensures that you understand what the places of a number really mean.",
                "Subtract two-digit numbers by breaking the second number down into its tens and ones. \nStep 1: Subtract the tens from the first number. \nStep 2: Subtract the ones from that answer for the final result.",
                "Example: Subtract 83 - 24 using the pull apart method.\nBreak 24 down into its parts: 20 + 4.\nSubtract 20 from the original number: 83 - 20 = 63.\nSubtract 4 from the answer: 63 - 4 = 59. \nWrite that 59 is the final answer.",
                "GBHnS4vvobo",
                R.drawable.subtraction));

        //this material was referenced from https://www.aaamath.com/sub28dx2.htm
        topics.put(8, new Topic(8,
                "Subtraction",
                "Subtraction Algorithm",
                "How to subtract two digit numbers:",
                "Example: 67 - 45\nPlace one number above the other so the tens' place digits and ones' place digits are lined up. Draw a line under the bottom number.\n" +
                        "67\n" +
                        "45\n" +
                        "___\n" + "\n"+
                        "Subtract the two digits in the ones' place column. (7 - 5 = 2).\n" +
                        "67\n" +
                        "45\n" +
                        "___\n" +
                        " 2\n" + "\n"+
                        "Subtract the digits in the tens' place column (6 - 4 = 2) and place the answer below the line in the tens' place column.\n" +
                        "67\n" +
                        "45\n" +
                        "___\n" +
                        "22"+ "\n",
                "Hint: If the ones' place digit that is being subtracted is larger than the top ones' place digit, decrease the top tens' place digit by one and increase the top ones' place value by ten before subtracting.",
                "Y6M89-6106I",
                R.drawable.subwa));

        // this material was referenced from https://www.splashmath.com/math-vocabulary/algebra/repeated-addition
        topics.put(9, new Topic(9,
                "Multiplication",
                "Repeated Addition",
                "Repeated addition is adding equal groups together. It is also known as multiplication. If the same number is repeated, we can write that in the form of multiplication.",
                "For example: 2 + 2 + 2 + 2 + 2\n" +
                        "\n" +
                        "Here 2 is repeated 5 times, we can write this addition as 5 × 2. \n" +
                        "\n" +
                        "Similarly, to solve a multiplication problem through repeated addition, we repetitively group and add the same number again and again to find the answer. ",
                "For example:" +"\n" +"If there are 5 groups and 3 chickens in each group, add to find the total chickens.\n" +
                        "\n" +
                        "3 + 3 + 3 + 3 + 3 = 15\n"+
                        "There are 15 chickens total.",
                "dpFOvoiYDaQ",
                R.drawable.repeatedaddition));

        // this material was referenced from https://study.com/academy/lesson/learning-multiplication-facts-to-10-using-skip-counting.html
        topics.put(10, new Topic(10,
                "Multiplication",
                "Skip Counting",
                "What is skip counting?\n"+
                "Example: Let's pretend you and three friends have started your own dog walking business. Each person created 7 flyers to hand out to neighbors to advertise the business. Knowing that each flyer goes to a different house, how many houses will the group of 4 people need to visit?\n \nWe can solve this multiplication problem really quickly using skip counting, which is when you add using intervals (the distance between two numbers along a number line).",
                "Solution: You must find the answer to 7 flyers multiplied by 4 people. You could simply count out your 7s to find the answer: 7, 14, 21, 28. \nThat means there are 28 flyers and you and your friends need to visit 28 houses.",
                "The multiplication problem that you solved is 7 x 4 = 28. By skip counting your 7s four times, you found the answer to your multiplication problem, which is known as a product.",
                "ybeDUuBhEdM",
                R.drawable.skipcounting));

        //this material was referenced from https://www.education.com/resources/one-digit-multiplication-and-equal-groups/
        topics.put(11, new Topic(11,
                "Multiplication",
                "Equal Groups",
                "Start thinking of multiplication in groups and sets!",
                "Example: Imagine having 12 ducks and being told you had to divide them up into equal groups. How would you do this?\n \n"+
                "Well, think about it. How many groups can you make? Let's say you can make 3 groups. How many ducks would go into one group?\n"+
                "The answer is 3 ducks. To divide 12 ducks up into equal groups, we just did 4 equals groups of 3!",
                "Hint: It helps to draw it up and circle the groups! ",
                "RNxwasijbAo",
                R.drawable.equalgroups));

        // this material is referenced from https://www.dummies.com/education/math/pre-algebra/how-to-multiply-multiple-digits/
        topics.put(12, new Topic(12,
                "Multiplication",
                "Multiplication Algorithm",
                "Multiplying large numbers: \nStep 1: Stack the first number on top of the second. \n\nStep 2: Multiply each digit of the bottom number, from right to left, by the top number. In other words, first multiply the top number by the ones digit of the bottom number. Then write down a 0 as a placeholder and multiply the top number by the tens digit of the bottom number.",
                "Hint: When the result is a two-digit number, write down the ones digit and carry the tens digit to the next column. After multiplying the next two digits, add the number you carried over.\n" +
                        "\n" +
                        "Step 3: Add the products to obtain the final answer.",
                "Example: Multiply 742 x 136.\n\n"+ "1. Stack the first number on top of the second, by aligning the ones places\n"+
                "2. Now multiply 6 by every number in 742, starting from the right. \n3. Because 2 x 6 = 12, a two-digit number, you write down the 2 and carry the 1 to the tens column. \n4. In the next column, you multiply 4 x 6 = 24, and add the 1 you carried over, giving you a total of 25.\n" +
                        "5. Write down the 5, and carry the 2 to the hundreds column. \n6. Multiply 7 x 6 = 42, and add the 2 you carried over, giving you 44:\n"+
                "7. Next, write down a 0 in the ones place in the next row. \n8. Multiply 3 by every number in 742, starting from the right and carrying when necessary\n"+
                "9. Write down two 0s as placeholders for the ones and tens place in the next row. \n10. Repeat the process with 1 and to finish, add up the products.",
                "FJ5qLWP3Fqo",
                R.drawable.mulwa));

        //this material is referenced from https://www.tutorialspoint.com/multiply_and_divide_whole_numbers/fact_families_for_multiplication_and_division.htm
        topics.put(13, new Topic(13,
                "Division",
                " Fact Families",
                "Fact family: It is a set of four related multiplication and division facts that use the same three numbers.",
                "Example: The fact family for 3, 8 and 24 is a set of four multiplication and division facts. Two are multiplication facts, whereas the other two are division facts.",
                "\n" +
                        "3\t×\t8\t=\t24\n" +
                        "8\t×\t3\t=\t24\n" +
                        "24\t÷\t3\t=\t8\n" +
                        "24\t÷\t8\t=\t3",
                "-JFcesiUTpw",
                R.drawable.factfamily));

        //this material is referenced from https://www.helpingwithmath.com/by_subject/counting/skip_counting.html
        topics.put(14, new Topic(14,
                "Division",
                "Skip Counting",
                "Skip counting is often called counting by 2s, by 5s, by 10s, or by 100s. Skip counting really helps with addition, subtraction, multiplication, and division. It is also used a lot for counting things – counting pairs of gloves, groups of five, money, boxes with 100 cans in each box – the list goes on!",
                "To skip count, you add the same number over and over.\n" +
                        "\n" +
                        "You can start at any number. When you count normally, (like 1,2,3,4,5,6) you add 1 to get the next number. To count by 2s, you add 2 to get the next number.",
                "Now for division, instead of skip counting up like we do in multiplication, you skip count down.\n"+
                "Example: 25 ÷ 5 \n\nWe skip count 25 down by 5, 5 times. So, here we go! 25, 20, 15, 10, 5\n\n"+
                "So, the answer is 5!",
                "rGMecZ_aERo",
                R.drawable.skipcounting));

        // this material is referenced from https://study.com/academy/lesson/remainder-in-math-definition-theorem-examples.html
        topics.put(15, new Topic(15,
                "Division",
                "Remainder Concept",
                "Imagine you are entertaining a group of 14 people. You have 50 muffin appetizers, and you want to serve each individual the same number of muffins. You line up 14 plates and begin to distribute the muffins, one at a time. After filling each of the 14 plates with 3 muffins a piece, you realize that you don't have enough muffins left for another round, so the 8 muffins are extras, or remainders.",
                "The scenario just described is a division problem. We divided 50 by 14 and found that 14 goes into 50 exactly 3 times with 8 left over: 50 /14 = 3 R8. \n\nIn this problem, the number 50 is the dividend, or the figure we want to divide up; 14 is the divisor, or the number we are dividing by. The quotient is how many times the divisor fits into the dividend, in this case, 3. Lastly, the remainder is what's left over, or 8.",
                "The remainder of a division problem is an interesting part of the problem. To find the remainder of a division problem, we can use long division of numbers.",
                "DCAr_Uk04Kw",
                R.drawable.remaindercon));

        // this material is referenced from https://www.splashmath.com/math-vocabulary/division/long-division
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
                "Step 1: The process begins with dividing or finding how many times the leftmost digit of the dividend can be divided by the divisor. \n" +
                        "Step 2: Then, the result or answer from step 1, which becomes the first digit of the quotient, is multiplied by the divisor and written under the first digit of the dividend. \n" +
                        "Step 3: Subtraction is carried out on the first digit of the dividend and the remainder is written. \n" +
                        "Step 4: The next digit of the dividend is brought down and then, the process is repeated until all the digits of the dividend are brought down and a remainder is found. ",
                "HdU_rf7eMTI",
                R.drawable.divwa));



    }
}
