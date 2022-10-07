package com.leetcode.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

  private static final char LEFT_SQUARE_BRACKET = '[';
  private static final char RIGHT_SQUARE_BRACKET = ']';
  private static final char LEFT_ROUND_BRACKET = '(';
  private static final char RIGHT_ROUND_BRACKET = ')';
  private static final char LEFT_CURLY_BRACKET = '{';
  private static final char RIGHT_CURLY_BRACKET = '}';

  public static void main(String[] args) {
    System.out.println(new ValidParentheses().isValid("()"));
    System.out.println(new ValidParentheses().isValid("()[]{}"));
    System.out.println(new ValidParentheses().isValid("({})[]"));
    System.out.println(new ValidParentheses().isValid("({)}"));
  }

  public boolean isValid(String s){
    Deque<Character> deque = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == LEFT_CURLY_BRACKET || s.charAt(i) == LEFT_ROUND_BRACKET || s.charAt(i) == LEFT_SQUARE_BRACKET) {
        deque.push(s.charAt(i));
      } else if (s.charAt(i) == RIGHT_ROUND_BRACKET && (deque.isEmpty() || deque.pop() != LEFT_ROUND_BRACKET)) {
        return false;
      } else if (s.charAt(i) == RIGHT_CURLY_BRACKET && (deque.isEmpty() || deque.pop() != LEFT_CURLY_BRACKET)) {
        return false;
      } else if (s.charAt(i) == RIGHT_SQUARE_BRACKET && (deque.isEmpty() || deque.pop() != LEFT_SQUARE_BRACKET)) {
        return false;
      }
    }
    return deque.isEmpty();
  }
}
