# Kenerate

## What is it

Kenerate is (supposed to be) a tool for generating Java code for me. Also I'd
like to play with Kotlin language.

## How to run

* Install Kotlin first:

```shell
$ curl -s 'https://get.sdkman.io' | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk install kotlin
```

* Then compile and run program:

```
$ kotlinc main.kt -include-runtime -d kenerate.jar
$ java -jar kenerate.jar
```
