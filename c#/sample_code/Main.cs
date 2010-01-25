using System;

namespace sample
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int times = 10;
			int start = 42;
			Console.WriteLine ("Starting loop...");
			for (int n = start; n < times + start; n++) {
				Console.WriteLine (n);
			}
			Console.WriteLine ("Done!");
			if(1 == 1) {
				Console.WriteLine("stuff");
			}
		}
	}
}
