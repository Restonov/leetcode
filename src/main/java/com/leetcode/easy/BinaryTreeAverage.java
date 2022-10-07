package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class BinaryTreeAverage {

  public static void main(String[] args) {
    BinaryTreeAverage average = new BinaryTreeAverage();
    TreeNode root = new TreeNode(3, new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    System.out.println(average.calculateAverageOfLevels(root));
  }

  public List<Double> calculateAverageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    double nodeValues = 0;
    while (!queue.isEmpty()) {
      int nodesAmount = queue.size();
      for (int i = 0; i < nodesAmount; i++) {
        TreeNode node = queue.poll();
        assert node != null;
        nodeValues += node.val;
        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }

      result.add(nodeValues / nodesAmount);
      nodeValues = 0;
    }

    return result;
  }
}





