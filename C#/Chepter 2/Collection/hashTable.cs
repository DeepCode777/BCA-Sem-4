using System;
using System.Collections;

namespace collection
{
    class hashTable
    {
        public static void Main(string[] args)
        {
            Hashtable ht = new Hashtable();
            ht.Add(1,"D");
            ht.Add(4,"P");
            ht.Add(3,"E");
            ht.Add(2,"E");
            
            foreach(object d in ht.Keys)
                Console.WriteLine(d);
                
            foreach(object r in ht.Values)
                Console.WriteLine(r);
        }
    }
}