package com.redi.j2;

public class FindElement {

  public static int findFirstInArray(String[] strings, String element) {

    // iterate over all the elements from the array parameter
    for(int i=0; i<strings.length; i++) {
      // comparing if the current element is equals the parameter
      if(strings[i].equals(element)) {
        return i;
      }
    }

    return -1;
  }
}