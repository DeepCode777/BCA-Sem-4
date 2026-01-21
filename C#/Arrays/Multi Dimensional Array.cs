using System;
class MultiArray
{
    static void Main(string[] args)
    {   //Multi Dimensional Array
        int[,] num = {{1,4,2},{3,6,8}};
        for(int i=0; i<num.GetLength(0); i++){
            for(int j=0; j<num.GetLength(1); j++){
                Console.Write(num[i,j] + "    ");
            }
            Console.WriteLine();
        }
    }
}