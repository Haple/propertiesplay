# propertiesplay

Want to play?
First remember to install de dependencies with `mvn clean install`.

After that, just change the environment when running the project:
`mvn spring-boot:run -Dspring-boot.run.profiles=ENVIRONMENT_HERE`

You can change the _ENVIRONMENT_HERE_ to tst or prd. If you run the
project only with `mvn spring-boot:run`, then the default configs will
be applied.

How to test it? Navigate to http://localhost:8080/hello with your browser 
or just make a GET request to this same url.

Just that. Have fun! 