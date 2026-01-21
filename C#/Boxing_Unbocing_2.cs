using System;

class Conversion
{
    public static void Main(string[] args)
    {
            int num = 23;
            Object obj = num;
            Console.WriteLine(obj); //Boxing
                
            int n = 25;
            Object r = n;
            int i = (int)r;
            Console.WriteLine(i); //Unboxing
    }
}
