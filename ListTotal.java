//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{

 //Julian Matuszewski
 //AP Computer Science, Period 2
 //precondition: ArrayList is not null
 public static int total( List<Integer> list )
 {
  //Inst/Dec int sum = 0
  int sum = 0;
  //Instantiate new Integer object i in
  //for-each loop (i: list)
  for (Integer i: list)
  {
    //sum += i.intValue()
    sum += i;
  }
  //return sum
  return sum;
 }
}