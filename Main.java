
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-javadoc-plugin</artifactId>
<version>3.1.1</version>
<configuration>
<defaultAuthor>Meeresgott</defaultAuthor>
<defaultVersion>${project.version}</defaultVersion>
<version>true</version>
<author>true</author>
</configuration>
<executions>
<execution>
<id>javadoc</id>
<goals>
<goal>jar</goal>
</goals>
</execution>
</executions>
</plugin>
        ...