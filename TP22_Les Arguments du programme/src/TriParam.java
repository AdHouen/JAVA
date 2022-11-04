import java.util.Arrays;

public class TriParam {

	public static void main(String... args) {

		Arrays.sort(args);

		for (int i = 0; i < args.length; i++) {
			System.out.println("L'argument numero " + i + " est : " + args[i]);

		}
		if (args.length == 0) {
			System.out.println("Aucun argument n'est donné à TriParam Usage: javac <options> <source files>\");");

		}

	}

}
