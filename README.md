# JavaPractice + Spring

## Why did we choose this subject?

With graduation so close, we wanted to pick a subject that we saw on many job application requirements. One of the most prevalent requirements was Java.

With that in mind, not only did we want to challenge ourselves to learn elements of Java, we wanted to utilize one of the most popular Back-End Frameworks: Spring.

## What problem does it solve?

One of the major advantages to using Spring is it streamlines the creation process of a Java application. It makes it incredibly fast to get a "Hello World" up and running once you're familiar with the process.

## What you'll need
**Installations**:

brew cask install java

brew install maven

brew install gradle (for good measure)

brew cask install intellij-idea-ce

**What we used to learn:** We used this [YouTube tutorial](https://www.youtube.com/watch?v=27I1M5RLplE)
## How does one use it?

We utilized the Spring Initializer below to make the process even easier

**Online Spring generator** [Spring Initializer](https://start.spring.io/)

- We generated a Maven Project with Java and Spring Boot 2.1.0
- We named our Group com.JavaTest
- Our artifact was named RestApp
- The only dependecy we used was Rest Repositories
- Generate Project

Afterward, this tool provides you with a zip file that you can import into your IDE (We learned how to, and then used IntelliJ)

**Once in IntelliJ**

1. When you first load up IntelliJ, you'll select import project.
2. In our example, we used Maven (a build automation tool). Another common example is Gradle.
3. We proceeded with all default settings and selected Finish
4. Once the project was build, we navigated to src/main/java/com.JavaTest.RestApp.java/RestAppApplication.java
5. In order to test, we right clicked on Spring Application and selected Run 'RestAppApplication...main()'
6. When we navigated on our browser to localhost:8080, it returned a json object
   - 8080 was the default port provided
7. Back in the IntelliJ, we created a HelloWorld class in the com.JavaTest.RestApp folder

8. Per the tutorial we were following, we wrote the following code:

```
package com.JavaTest.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

@RequestMapping("/")
public String index() {

return "Java can die in a fire." + " " + "I would prefer not to get a Java job at this time.";
    }
}
```

9. We saved, stopped the server wit hthe red box in the bottom-left, and restarted the server. When we navigated back to the browser, the json object was replaced with the string above

**Our Opinion**

We feel like our return string encompasses our current opinion of Java and Spring.  While we can see how Spring can drastically improve quality of life for getting a Java app running, most of our frustration comes from lack of familiarity with Java and its components.

**Challenges:**

The first major challenge was we selected a back end framework whose documentation assumed basic knowledge in Java. We didn't have any knowledge of Java... what a Java bean was... what Gradle was, what Maven was, or really anything at all.

The first step was to research all of these areas so we could even begin to follow a simple tutorial. We tried to use 3 prior to landing on the YouTube video listed above. We had to scrap all of the previous tutorials we were using due to bugs we could not overcome even with Google and Stack Overflows help, or because of the tutorial relied on outdated techologies or IDEs

While we know what our code does and how, there is still plenty of learn about Java before we could confidently claim to have familiarity.
