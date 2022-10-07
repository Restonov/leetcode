package com.leetcode.easy;

class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class MergeTwoSortedLists {

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    System.out.println(new MergeTwoSortedLists().mergeTwoLists(listNode1, listNode2));


  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedNode = new ListNode();

    int val1 = list1.val;
    int val2 = list2.val;

    if ()

    return mergedNode;
  }



}