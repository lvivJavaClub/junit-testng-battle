# junit-testng-battle

FIXME comment/uncomment junit-platform-surefire-provider

### Callbacks
```
mvn test \
-Dtest='com.example.callbacks.testng.**' \
-Dtest.listeners=\
com.example.callbacks.testng.MyAnnotationTransformer,\
com.example.callbacks.testng.MyInvokedMethodListener,\
com.example.callbacks.testng.MyTestListener,\
com.example.callbacks.testng.MySuiteListener,\
com.example.callbacks.testng.MyReporter
```

```
mvn test \
-Dtest='com.example.callbacks.testng.ATest' \
-Dtest.listeners=\
com.example.callbacks.testng.MyAnnotationTransformer,\
com.example.callbacks.testng.MyInvokedMethodListener,\
com.example.callbacks.testng.MyTestListener,\
com.example.callbacks.testng.MySuiteListener,\
com.example.callbacks.testng.MyReporter
```
```mvn clean test -Dtest='com.example.callbacks.junit.**'```
```mvn clean test -Dtest=com.example.callbacks.junit.BTest```

### Tags

IDEA
- run configuration, tags (JUnit 5), fill in tags - runs all classes, not specific
- run multiple groups
    - JUnit - yes, separate by space  - api ui
    - TestNG - yes, separate by comma - api,ui

CMD
- mvn test -Dtest=com.example.tags.TestJunit2 -Dtest.tags.include=api,ui
- mvn test -Dtest=com.example.tags.TestJunit1 -Dtest.tags.include=regression
- mvn test -Dtest.tags.include=regression
- mvn test

TestNG
- mvn test -Dtest.tags.include='.*chrome'
- mvn test -Dtest.tags.include='ui.*'
- mvn test -Dtest.tags.include='ui.chrome'
- mvn test -Dtest.tags.include='api' -Dtest.tags.exclude='broken'

JUnit
- mvn test -Dbrowser=chrome
- mvn test -Dtest.tags.include=ui
- mvn test -Dtest.tags.include=ui -Dbrowser=chrome
- mvn test -Dtest.tags.include='api' -Dtest.tags.exclude='broken'

TODO TestNG dependsOnMethod, dependsOnGroups

### Sorting
JUnit
- classes unordered (B D A C)
- methods alphabetic (a b c d)
- https://github.com/junit-team/junit4/wiki/test-execution-order
- https://stackoverflow.com/questions/19177195/running-junit4-test-classes-in-specified-order

TestNG
- same
- but sorting
- mvn test -Dtest.tags.include='abcd' -Dtest.listeners=com.example.sorting.testng.SortingInterceptor

Run Order
- JUnit
    - ?
- TestNG
    - alphabetical
    - could be changed

Clean TestNG CMD Run Command
preserve-order=false for <classes> tag

TODO задача про рюкзак https://seleniumcamp.com/talk/pandoras-white-box/

### Display Name
- mvn test -Dtest=com.example.displayname.TestTestng1
- mvn test -Dtest=com.example.displayname.TestJunit1

### Metadata