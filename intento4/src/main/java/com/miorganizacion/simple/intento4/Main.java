
package com.miorganizacion.simple.intento4;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "noguera";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/PuertoLimón." + EXTENSION;

		System.out.println("Interpreting file " + program);

		gramaticaLexer lexer = new gramaticaLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		gramaticaParser parser = new gramaticaParser(tokens);

		gramaticaParser.ProgramContext tree = parser.program();

		gramaticaCustomVisitor visitor = new gramaticaCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
