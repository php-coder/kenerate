import java.io.File

fun usage() {
	println("Usage: kenerate class <name> [-package <package>]")
}

fun main(args: Array<String>) {
	if (args.size < 2) {
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
	var filePath: String = fileName;
	
	var packageName: String? = null
	var fileDir: String? = null
	if (args.size >= 3) {
		if (args[2] == "-package") {
			if (args.size == 3) {
				println("Error: -package requires an argument")
				usage()
				return
			}
			packageName = args[3]
			fileDir = packageName.replace(".", File.separator)
			filePath = fileDir + File.separator + fileName
		}
	}
	
	println("Generating file $filePath")
	val dir: File = File(fileDir)
	if (!dir.exists()) {
		if (!dir.mkdirs()) {
			println("Error: couldn't create $fileDir")
			return
		}
	}
	
	// @todo #4 class: support for visibility modifiers
	// @todo #4 class: support for adding a comment
	// @todo #4 class: support for adding an annotation
	// @todo #4 class: support for adding an import
	val content: StringBuilder = StringBuilder()
	if (packageName != null) {
		content.append("package ${packageName};\n\n")
	}
	content.append("class $className {\n}\n")
	File(filePath).writeText(content.toString())
}
