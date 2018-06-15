# Kenerate

## What is it

Kenerate is (supposed to be) a tool for generating Java code for me. Also I'd
like to play with Kotlin language.

## How to run

* Install Kotlin first:

```console
$ curl -s 'https://get.sdkman.io' | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk install kotlin
```

* To compile a program:

```console
$ kotlinc main.kt -include-runtime -d kenerate.jar
```

or simply

```console
$ make
```

* Now, let's run it:
```console
$ java -jar kenerate.jar class Test
Generating file Test.java
$ cat Test.java
class Test {
}
```
