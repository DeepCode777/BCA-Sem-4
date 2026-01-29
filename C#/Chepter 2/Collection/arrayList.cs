using System;
using System.Collections;

namespace Sololearn
{
    class arrayList
    {
        public static void Main(string[] args)
        {
            ArrayList arr = new ArrayList();
            arr.Add(12);
            arr.Add(25.04);
            arr.Add("Light");
            arr.Add(true);
            arr.Add('R');
            
            foreach(var r in arr){
                Console.WriteLine(r);
            }
        }
    }
}