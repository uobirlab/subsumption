Subsumption
===========

This is a simple library for creating reactive architectures for
robots with rosjava. It is a port of the subsumption architecture for
Lejos.

To use, enter the project directory and type `gradle install`. This
should install the subsumption library to your local `.m2` cache so
you can use it in your projects. 

You can verify that it installed correctly by taking a look with `ls
~/.m2/repository/barc/subsumption/subsumption/0.0.1/`.

Now, when you want to use this in your projects, you simply add it as
a dependency to your `build.gradle` file, like so:

```groovy
dependencies {
    compile 'barc.subsumption:subsumption:0.0.1'
}    
```
