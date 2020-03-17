/*
Author:         Wasiem Cassiem
Student No:     216029724
Date:           14/03/2020
 */

import java.util.*;

public class PersonMain
{
    public static void main(String[] args)
    {
            Person pers = new Person("Morgan", "Freeman", 64);
            Person pers2 = new Person("Barry", "Allen",  33);
            Person pers3 = new Person("Harry", "Potter", 24);


            //MAP...
            HashMap<Integer, Person> map = new HashMap<Integer, Person>();

            map.put(1, pers);
            map.put(2, pers2);
            map.put(3, pers3);

            System.out.println("Map");
            System.out.println(map.toString());

            System.out.println("Remove pers2 object " + map.get(2));
            map.remove(2);
            System.out.println(map.toString());


            //SET...
            System.out.println("\nSet");

            HashSet <Person> hashSet = new HashSet<Person>();
            hashSet.add(pers);
            hashSet.add(pers2);
            hashSet.add(pers3);

            System.out.println(hashSet.toString());
            System.out.println("Remove pers3 object " + hashSet.remove(pers3));

            System.out.println("Printing new set of objects");
            System.out.println(hashSet.toString());


            //LIST...
            System.out.println("\nList");

            List<Person> list = new ArrayList<Person>();
            list.add(pers);
            list.add(pers2);

            list.add(1, pers3);     // making object 3 index 1 in the array.
            System.out.println(list.toString());
    }
}
