using System;
using System.Collections.Generic;

namespace Reverse32BitUnsignedInteger
{
    class Program
    {
        static void Main(string[] args)
        {
            uint output = reverseBits(1);
            Console.WriteLine(output);
            Console.ReadKey();
        }


        public static uint reverseBits(uint n)
        {
            uint output = 0;
            for (int i = 0; i < 32; i++)
            {
                var temp = (n >> i) & 1;
                output = output | (temp << (31 - i));
                
            }

            return output;
        }

       
    }
}
