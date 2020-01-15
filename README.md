# extension-point-common
## Introduction
This package provides 2 annotations ``@ExtensionPointTemplate`` and ``@RegisterExtensionPoint``.
 - ``@ExtensionPointTemplate`` helps to mark a **method** as a ExtensionPointTemplate
 - ``@RegisterExtensionPoint`` for microservice to scan the extension points and save them to EP
## How to use
### Use package locally
 - clone the code
 - run ``mvn clean install``
 - add dependency in your microservice
 ```
         <dependency>
            <groupId>sap.cx.panda</groupId>
            <artifactId>extension-point-common</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
 ```
  - Add ``@ExtensionPointTemplate`` above methods
  - Add ``@RegisterExtensionPoint`` above spring boot Application