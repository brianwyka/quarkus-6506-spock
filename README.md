# quarkus-spock

Using `quarkusDev`:

    > Task :quarkusDev FAILED
    
    FAILURE: Build failed with an exception.
    
    * What went wrong:
    Some problems were found with the configuration of task ':quarkusDev' (type 'QuarkusDev').
    > Directory '/Users/marceloverdijk/workspace/quarkus-spock/build/classes/groovy/main' specified for property 'workingDir' does not exist.
    > Directory '/Users/marceloverdijk/workspace/quarkus-spock/src/main/groovy' specified for property 'sourceDir' does not exist.
    
    * Try:
    Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
    
    * Get more help at https://help.gradle.org
    
    BUILD FAILED in 871ms
    4 actionable tasks: 4 executed
    
Using `run`:
    
    ❯ ./gradlew clean run       
    
    > Task :run
    main called
    
    BUILD SUCCESSFUL in 996ms
    4 actionable tasks: 4 executed
    
Using `build && java -jar`

    ❯ ./gradlew clean build  
    
    > Task :quarkusBuild
    building quarkus runner
    
    > Task :test
    WARNING: An illegal reflective access operation has occurred
    WARNING: Illegal reflective access by org.codehaus.groovy.vmplugin.v7.Java7$1 (file:/Users/marceloverdijk/.m2/repository/org/codehaus/groovy/groovy/2.5.8/groovy-2.5.8.jar) to constructor java.lang.invoke.MethodHandles$Lookup(java.lang.Class,int)
    WARNING: Please consider reporting this to the maintainers of org.codehaus.groovy.vmplugin.v7.Java7$1
    WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
    WARNING: All illegal access operations will be denied in a future release
    
    BUILD SUCCESSFUL in 4s
    11 actionable tasks: 11 executed
    
    quarkus-spock on  master [?] via ☕ v11.0.2 took 5s 
    ❯ java -jar build/quarkus-spock-1.0-SNAPSHOT-runner.jar 
    2020-01-10 19:39:05,574 INFO  [io.quarkus] (main) quarkus-spock 1.0-SNAPSHOT (running on Quarkus 1.1.1.Final) started in 0.585s. Listening on: http://0.0.0.0:8080
    2020-01-10 19:39:05,594 INFO  [io.quarkus] (main) Profile prod activated. 
    2020-01-10 19:39:05,594 INFO  [io.quarkus] (main) Installed features: [cdi, resteasy]
    ^C2020-01-10 19:39:09,735 INFO  [io.quarkus] (main) quarkus-spock stopped in 0.034s
