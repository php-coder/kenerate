import java.io.File

fun main(args: Array<String>) {
	if (args.size != 2) {
		println("Usage: kenerate class <name>")
		return
	
	}
	
	val action: String = args[0]
	if (action != "class") {
		println("Error: unknown action: $action")
		println("Usage: kenerate class <name>")
		return
	}
	
	val className: String = args[1]
	val fileName: String = className + ".java"
	println("Generating file $fileName")
	
	val content = "class $className {\n}\n"
	File(fileName).writeText(content)
}
