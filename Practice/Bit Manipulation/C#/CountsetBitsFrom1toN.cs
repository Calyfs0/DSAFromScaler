using System;

namespace FindNumberOfBits
{
    class Program
    {
        static int[] BitsSetTable256 = new int[256];
        static void Main(string[] args)
        {
            
            initialize();
			int count = 0;
			int n = 1000000000;
			for (int i = 1; i <= n; i++) {
				count += countSetBits(n);
			}
			Console.Write(count);
			Console.ReadKey();
        }
		public static int countSetBits(int n)
		{
			return (BitsSetTable256[n & 0xff]
					+ BitsSetTable256[(n >> 8) & 0xff]
					+ BitsSetTable256[(n >> 16) & 0xff]
					+ BitsSetTable256[n >> 24]);
		}

		public static void initialize()
        {

            // To initially generate the
            // table algorithmically
            BitsSetTable256[0] = 0;
            for (int i = 0; i < 256; i++)
            {
                BitsSetTable256[i] = (i & 1) + BitsSetTable256[i / 2];
            }
        }
    }
}

/*
 
 		[0]	0	int
		[1]	1	int
		[2]	1	int
		[3]	2	int
		[4]	1	int
		[5]	2	int
		[6]	2	int
		[
7]	3	int
		[8]	1	int
		[9]	2	int
		[10]	2	int
		[11]	3	int
		[12]	2	int
		[13]	3	int
		[14]	3	int
		[15]	4	int
		[16]	1	int
		[17]	2	int
		[18]	2	int
		[19]	3	int
		[20]	2	int
		[21]	3	int
		[22]	3	int
		[23]	4	int
		[24]	2	int
		[25]	3	int
		[26]	3	int
		[27]	4	int
		[28]	3	int
		[29]	4	int
		[30]	4	int
		[31]	5	int
		[32]	1	int
		[33]	2	int
		[34]	2	int
		[35]	3	int
		[36]	2	int
		[37]	3	int
		[38]	3	int
		[39]	4	int
		[40]	2	int
		[41]	3	int
		[42]	3	int
		[43]	4	int
		[44]	3	int
		[45]	4	int
		[46]	4	int
		[47]	5	int
		[48]	2	int
		[49]	3	int
		[50]	3	int
		[51]	4	int
		[52]	3	int
		[53]	4	int
		[54]	4	int
		[55]	5	int
		[56]	3	int
		[57]	4	int
		[58]	4	int
		[59]	5	int
		[60]	4	int
		[61]	5	int
		[62]	5	int
		[63]	6	int
		[64]	1	int
		[65]	2	int
		[66]	2	int
		[67]	3	int
		[68]	2	int
		[69]	3	int
		[70]	3	int
		[71]	4	int
		[72]	2	int
		[73]	3	int
		[74]	3	int
		[75]	4	int
		[76]	3	int
		[77]	4	int
		[78]	4	int
		[79]	5	int
		[80]	2	int
		[81]	3	int
		[82]	3	int
		[83]	4	int
		[84]	3	int
		[85]	4	int
		[86]	4	int
		[87]	5	int
		[88]	3	int
		[89]	4	int
		[90]	4	int
		[91]	5	int
		[92]	4	int
		[93]	5	int
		[94]	5	int
		[95]	6	int
		[96]	2	int
		[97]	3	int
		[98]	3	int
		[99]	4	int
		[100]	3	int
		[101]	4	int
		[102]	4	int
		[103]	5	int
		[104]	3	int
		[105]	4	int
		[106]	4	int
		[107]	5	int
		[108]	4	int
		[109]	5	int
		[110]	5	int
		[111]	6	int
		[112]	3	int
		[113]	4	int
		[114]	4	int
		[115]	5	int
		[116]	4	int
		[117]	5	int
		[118]	5	int
		[119]	6	int
		[120]	4	int
		[121]	5	int
		[122]	5	int
		[123]	6	int
		[124]	5	int
		[125]	6	int
		[126]	6	int
		[127]	7	int
		[128]	1	int
		[129]	2	int
		[130]	2	int
		[131]	3	int
		[132]	2	int
		[133]	3	int
		[134]	3	int
		[135]	4	int
		[136]	2	int
		[137]	3	int
		[138]	3	int
		[139]	4	int
		[140]	3	int
		[141]	4	int
		[142]	4	int
		[143]	5	int
		[144]	2	int
		[145]	3	int
		[146]	3	int
		[147]	4	int
		[148]	3	int
		[149]	4	int
		[150]	4	int
		[151]	5	int
		[152]	3	int
		[153]	4	int
		[154]	4	int
		[155]	5	int
		[156]	4	int
		[157]	5	int
		[158]	5	int
		[159]	6	int
		[160]	2	int
		[161]	3	int
		[162]	3	int
		[163]	4	int
		[164]	3	int
		[165]	4	int
		[166]	4	int
		[167]	5	int
		[168]	3	int
		[169]	4	int
		[170]	4	int
		[171]	5	int
		[172]	4	int
		[173]	5	int
		[174]	5	int
		[175]	6	int
		[176]	3	int
		[177]	4	int
		[178]	4	int
		[179]	5	int
		[180]	4	int
		[181]	5	int
		[182]	5	int
		[183]	6	int
		[184]	4	int
		[185]	5	int
		[186]	5	int
		[187]	6	int
		[188]	5	int
		[189]	6	int
		[190]	6	int
		[191]	7	int
		[192]	2	int
		[193]	3	int
		[194]	3	int
		[195]	4	int
		[196]	3	int
		[197]	4	int
		[198]	4	int
		[199]	5	int
		[200]	3	int
		[201]	4	int
		[202]	4	int
		[203]	5	int
		[204]	4	int
		[205]	5	int
		[206]	5	int
		[207]	6	int
		[208]	3	int
		[209]	4	int
		[210]	4	int
		[211]	5	int
		[212]	4	int
		[213]	5	int
		[214]	5	int
		[215]	6	int
		[216]	4	int
		[217]	5	int
		[218]	5	int
		[219]	6	int
		[220]	5	int
		[221]	6	int
		[222]	6	int
		[223]	7	int
		[224]	3	int
		[225]	4	int
		[226]	4	int
		[227]	5	int
		[228]	4	int
		[229]	5	int
		[230]	5	int
		[231]	6	int
		[232]	4	int
		[233]	5	int
		[234]	5	int
		[235]	6	int
		[236]	5	int
		[237]	6	int
		[238]	6	int
		[239]	7	int
		[240]	4	int
		[241]	5	int
		[242]	5	int
		[243]	6	int
		[244]	5	int
		[245]	6	int
		[246]	6	int
		[247]	7	int
		[248]	5	int
		[249]	6	int
		[250]	6	int
		[251]	7	int
		[252]	6	int
		[253]	7	int
		[254]	7	int
		[255]	8	int

 */