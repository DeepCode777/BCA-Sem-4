using System;
class SingleArray
{
    static void Main(string[] args)
    {   // Single Dimensional Array
        string[] cars = {"Ferrari","BMW","Ford","Audi"};
        for(int i=0; i<cars.Length; i++){
            Console.WriteLine(cars[i]);
        }
    }
}