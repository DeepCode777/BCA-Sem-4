using System;
class JaggedArray
{
    static void Main(string[] args)
    {   //Jagged Dimensional Array
        int[][] nu = new int[2][];
        nu[0] = new int[3]{1,2,3};
        nu[1] = new int[3]{4,5,6};
        for(int i=0; i<nu.Length; i++){
            for(int j=0; j<nu[i].Length; j++){
                Console.Write(nu[i][j] + "    ");
            }
            Console.WriteLine();
        }
    }
}