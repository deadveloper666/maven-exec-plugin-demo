# maven-exec-plugin-demo
Maven proyect using maven exec plugin

## Show how to run a initial bootstrap.sh script before build that fetchs a file

```xml 
<plugin>
				<artifactId>exec-maven-plugin</artifactId>
				<groupId>org.codehaus.mojo</groupId>
				<version>1.6.0</version>
				<executions>
					<execution>
						<id>Download Necessary File before Build</id>
						<phase>initialize</phase>
						<goals>
							<goal>exec</goal>
						</goals>
						<configuration>
							<executable>${basedir}/bootstrap.sh</executable>
						</configuration>
					</execution>
				</executions>
			</plugin>	
```


## Check that file exist at maven test phase
```java
    @Test
    public void shouldAnswerWithTrue()
    {
        File f = new File("./320px-Oceanus-es.png");
        assertTrue( f.exists() );
    }
```    
## Execute final script that remove the file

```xml
    <plugin>
        <artifactId>exec-maven-plugin</artifactId>
        <groupId>org.codehaus.mojo</groupId>
        <executions>
            <execution>
                <id>Do Some Native Task</id>
                <phase>install</phase>
                <goals>
                    <goal>exec</goal>
                </goals>
                <configuration>
                    <executable>${basedir}/doSomeNativeTask.sh</executable>
                </configuration>
            </execution>
        </executions>
    </plugin>
</plugins>
```        

Demo project for public tutorial at 