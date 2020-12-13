package com.lab4;
import java.util.*;

public class BalancedExpression {
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<>();


        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }

            char check;
            switch (x) {
                case ')':
                    if (stack.isEmpty())
                        return false;
                    check = stack.pop();
                    if (check == '{' || check == '[') //|| stack.isEmpty())
                        return false;
                    break;

                case '}':
                    if (stack.isEmpty())
                        return false;
                    check = stack.pop();
                    if (check == '(' || check == '[' || stack.isEmpty())
                        return false;
                    break;

                case ']':
                    if (stack.isEmpty())
                        return false;
                    check = stack.pop();
                    if (check == '(' || check == '{' || stack.isEmpty())
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }
}
