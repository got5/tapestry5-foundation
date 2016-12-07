## Tapestry 5 Foundation Module - 4.1.1


## Features

This module for Apache Tapestry provides a collections of components and mixin that ease the use of the Foundation CSS framework.

	
## Javascript Components

###NAVIGATION
- **Off-canvas**  will be available soon
- **TopBar**
	- Based on [http://foundation.zurb.com/docs/components/topbar.html](http://foundation.zurb.com/docs/components/topbar.html)
- **Magellan**
	- Based on [http://foundation.zurb.com/docs/components/magellan.html](http://foundation.zurb.com/docs/components/magellan.html)	


### CALLOUTS & PROMPTS
- **Reveal**
	- Based on [http://foundation.zurb.com/docs/components/reveal.html](http://foundation.zurb.com/docs/components/reveal.html)	
- **Alert**
	- Based on [http://foundation.zurb.com/docs/components/alert_boxes.html](http://foundation.zurb.com/docs/components/alert_boxes.html)

- **tooltips**  will be available soon

- **Joyride**
	- Based on [http://foundation.zurb.com/docs/components/joyride.html](http://foundation.zurb.com/docs/components/joyride.html)

### CONTENT
- **DropDown**
	- Based on [http://foundation.zurb.com/docs/components/dropdown.html](http://foundation.zurb.com/docs/components/dropdown.html)

- **Accordion**
	- Based on [http://foundation.zurb.com/docs/components/accordion.html](http://foundation.zurb.com/docs/components/accordion.html)

- **Tab**
	- Based on [http://foundation.zurb.com/docs/components/tabs.html](http://foundation.zurb.com/docs/components/tabs.html)

- ** Equalizer**  will be available soon

## How to use it

Just  add the following dependency in your `pom.xml`.

For Tapestry 5.4 :

	<dependencies>
		...
		<dependency>
			<groupId>org.got5</groupId>
			<artifactId>tapestry5-foundation</artifactId>
			<version>4.1.1</version>
		</dependency>
		...
	</dependencies>

	<repositories>
		...
		<repository>
          		<id>central</id>
          		<url>https://repo1.maven.org/maven2</url>
          		<releases>
            			<enabled>true</enabled>
          		</releases>
        	</repository>

		<repository>
			<id>oss—sonatype-snapshot-repo</id>
			<url>https://oss.sonatype.org/content/repositories/snapshots
			</url>
			<releases>
				<enabled>false</enabled>
			</releases>
		</repository>
		...
	</repositories>

## To run the demo

```bash
mvn jetty:run
```
Application is now running in : [http://localhost:8080/](http://localhost:8080/)	