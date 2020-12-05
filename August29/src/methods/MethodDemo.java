package methods;

public class MethodDemo {

	public static void main(String[] args) {

		// Methods -> Group of statements that perform specific action

		String str = "java";
		
		System.out.println(str.substring(2)); // methods that come from String class

//		MethodDemo.displayFigure();

//		 DRY -> Don't Repeat Yourself
//		Methods will prevent repeating myself 
//		Methods provide re-usability and concise code

		// Methods are divided into 2 categories based on the value they return:
		// 1. void methods -> methods that do something and that's it, no value returned as a result
		//  add void to method definition before the method name
		// 2. non-void methods -> methods that do something and return the result
		

		

	}

	public static void displaySnake() {

		System.out.println("     ,,'6''-,.");
		System.out.println("    <====,.;;--.");
		System.out.println("    _`---===. \"\"\"==__");
		System.out.println("   //\"\"@@-\\===\\@@@@ \"\"\\\\");
		System.out.println("   |( @@@ |===| @@@ ||");
		System.out.println("   \\\\ @@  |===| @@ //");
		System.out.println("    \\\\ @@ |===|@@@ //");
		System.out.println("     \\\\ |===| //");
		System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
		System.out.println(" \"\"\"\"---,__`\\===`/ _________,---------,____  `,");
		System.out.println("       |==||              `\\  \\");
		System.out.println("      |==| |               )  |");
		System.out.println("      |==| |    _____     ______,--'  '");
		System.out.println("      |=| `----\"\"\"   `\"\"\"\"\"\"\"\"     _,-'");
		System.out.println("      `=\\   __,---\"\"\"-------------\"\"\"''");
		System.out.println("        \"\"\"\" ");

	}

	public static void displayTeddyBear() {
		System.out.println("      ___  .--. ");
		System.out.println("   .--.-\"  \"-' .- |");
		System.out.println("   / .-,`     .'");
		System.out.println("   \\  `      \\");
		System.out.println("   '.      ! \\");
		System.out.println("    |   ! .--. |");
		System.out.println("    \\    '--' /.____");
		System.out.println("    /`-.   \\__,'.'   `\\");
		System.out.println("  __/  \\`-.____.-' `\\   /");
		System.out.println("  | `---`'-'._/-`   \\----'  _");
		System.out.println("  |,-'` /       |  _.-' `\\");
		System.out.println("  .'   /       |--'`   / |");
		System.out.println(" /   /\\       `     | |");
		System.out.println(" |  .\\/ \\   .--. __     \\ |");
		System.out.println("  '-'   '._    / `\\     /");
		System.out.println("        `\\  '   |------'`");
		System.out.println("         \\ |   |");
		System.out.println("         \\    /");
		System.out.println("          '._ _.'");
		System.out.println("           ``");
	}

	public static void displayElephant() {
		System.out.println("    _..--\"\"-.         .-\"\"--.._ ");
		System.out.println("  _.-'     \\ __...----...__ /     '-._");
		System.out.println(" .'   .:::...,'       ',...:::.   '.");
		System.out.println("(   .'``'''::;         ;::'''``'.   )");
		System.out.println(" \\       '-)       (-'       /");
		System.out.println(" \\       /        \\       /");
		System.out.println("  \\     .'.-.      .-.'.     /");
		System.out.println("  \\     | \\0|      |0/ |     /");
		System.out.println("  |     \\ |  .-==-.  | /     |");
		System.out.println("   \\     `/`;     ;`\\`     /");
		System.out.println("   '.._   (_ | .-==-. | _)   _..'");
		System.out.println("     `\"`\"-`/ `/'    '\\` \\`-\"`\"`");
		System.out.println("        / /`;  .==.  ;`\\ \\");
		System.out.println("     .---./_/  \\ .==. /  \\ \\");
		System.out.println("    / '.  `-.__)    |  `\"");
		System.out.println("    | =(`-.    '==.  ;");
		System.out.println("    \\ '. `-.      /");
		System.out.println("     \\_:_)  `\"--.....-'");
	}

	public static void displayButterfly() {
		System.out.println(" .==-.          .-==.   ");
		System.out.println("  \\()8`-._ `.  .' _.-'8()/   ");
		System.out.println("  (88\"  ::. \\./ .::  \"88)   ");
		System.out.println("  \\_.'`-::::.(#).::::-'`._/   ");
		System.out.println("   `._... .q(_)p. ..._.'     ");
		System.out.println("    \"\"-..-'|=|`-..-\"\"    ");
		System.out.println("    .\"\"' .'|=|`. `\"\".    ");
		System.out.println("   ,':8(o)./|=|\\.(o)8:`.    ");
		System.out.println("   (O :8 ::/ \\_/ \\:: 8: O)   ");
		System.out.println("   \\O `::/    \\::' O/    ");
		System.out.println("    \"\"--'     `--\"\"  hjw");
	}

}
