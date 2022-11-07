package item1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class AfficheRacineProjet {

	public static void main(String[] args) throws IOException {
		Path monRepertoire = Paths.get(".");
		DirectoryStream<Path> stream = Files.newDirectoryStream(monRepertoire);
		try {
			Iterator<Path> iterator = stream.iterator();
			while (iterator.hasNext()) {
				Path p = iterator.next();
				if (Files.isDirectory(p)) {
					System.out.println("[" + p.toString().replace(".\\", "") + "]");

				} else if (Files.isRegularFile(p)) {
					System.out.println(p.toString().replaceFirst("\\.\\\\", ""));
				}

			}
		} finally {
			stream.close();
		}

	}
}
