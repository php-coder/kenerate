import java.io.File

fun usage() {
	println("Usage: kenerate class <name> [-package <package>]")
}

fun main(args: Array<String>) {
	if (args.size != 2) {
		usage()
		return
	
	}
	
	val action: String = args[0]
	if (action != "class") {
		println("Error: unknown action: $action")
		usage()
		return
	}
	
	val className: String = args[1]
	val fileName: String = className + ".java"
	println("Generating file $fileName")
	
	// @todo #4 class: support for a package
	// @todo #4 class: support for visibility modifiers
	// @todo #4 class: support for adding a comment
	// @todo #4 class: support for adding an annotation
	// @todo #4 class: support for adding an import
	val content = "class $className {\n}\n"
	File(fileName).writeText(content)
}
