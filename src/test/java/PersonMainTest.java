import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonMainTest
{
    Person pers = new Person("Morgan", "Freeman", 64);
    Person pers2 = new Person("Barry", "Allen",  33);
    Person pers3 = new Person("Harry", "Potter", 24);

    @Test
    public void mapTest()
    {
        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, pers);
        map.put(2, pers2);
        map.put(3, pers3);
        map.remove(2);

        //Create New Hash Map
        HashMap<Integer, Person> map2 = new HashMap<>();
        map2.put(1, pers);
        map2.put(2, pers2);
        map2.put(3, pers);
        map2.remove(2);

        assertEquals(map, map2);                                  //Checks if new map is equal to the old map
        assertTrue(map.containsKey(1));                           //Checks if map has an object
    }


    @Test
    public void setTest()
    {
        HashSet<Person> hashSet = new HashSet<Person>();

        hashSet.add(pers3);                                         // Checks to see if object has been successfully added
        assertTrue(hashSet.contains(pers3));

        assertEquals(3, hashSet.size());                  //Checks to see if it's added into the correct index number
    }


    @Test
    public void listTest()
    {
        List<Person> list = new ArrayList<Person>();

        list.add(pers);                                             //Checks to see if Person object has been successfully added
        assertTrue(list.contains(pers));

        list.remove(pers2);                                        //Checks to see if Person object has been removed
        assertTrue(!list.contains(pers2));
    }
}