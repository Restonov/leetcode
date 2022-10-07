package com.leetcode.easy;

public class LongestCommonPrefix {

  public static void main(String[] args) {
    LongestCommonPrefix task = new LongestCommonPrefix();
    System.out.println(task.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
  }

  public String longestCommonPrefix(String[] strs) {
    String commonPrefix = "";
    final String shortestWord = defineShortestWord(strs);

    for (int i = 0; i < shortestWord.length(); i++) {
      String tempPrefix = shortestWord.substring(0, i + 1);
      if(isAllWordsContainsSymbol(strs, tempPrefix)) {
        commonPrefix = tempPrefix;
      }
    }
    return commonPrefix;
  }


  private String defineShortestWord(String[] words) {
    String shortestWord = words[0];
    for (String word : words) {
      if (shortestWord.length() > word.length()) {
        shortestWord = word;
      }
    }
    return shortestWord;
  }

  private boolean isAllWordsContainsSymbol(String[] words, String symbol) {
    boolean isValidated = true;
    for (String word : words) {
      if (!word.startsWith(symbol)) {
        isValidated = false;
        break;
      }
    }
    return isValidated;
  }
}
