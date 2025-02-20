/*
 * *** YOUR NAME GOES HERE / YOUR SECTION NUMBER ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    return setA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    // Create an iterator for the entry set of the TreeMap to allow us to traverse through it.
    Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();

    // Loop through as long as there are more elements in the iterator
    while (iterator.hasNext()) {
      // Retrieve the next Key, Value pair
      Map.Entry<Integer, String> entry = iterator.next();
      // Remove the entry if the key is even
      if (entry.getKey() % 2 == 0) {
        iterator.remove();
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    // Using equals method to check if tree1 and tree2 are equal
    return tree1.equals(tree2);

  }

} // end treeProblems class
