-*  resource uses
	Eclipse IDE + maven plugin
	Maven

1*	command for create project with maven
	mvn archetype:create -DarchetypeGroupId=org.springframework.ws -DarchetypeArtifactId=spring-ws-archetype -DarchetypeVersion=1.5.6 -DgroupId=pe.com.spring.ws.example -DartifactId=spring-ws-example
2*	add repositories in POM file
	<!-- define properties for set the version of dependency-->
	<properties>
		<cxf.version>2.1.1</cxf.version>
	</properties>

	<!-- All dependencies for maven project -->
	<dependencies>
		<!-- Spring WS dependencies-->
		<dependency>
			<groupId>org.springframework.ws</groupId>
			<artifactId>spring-oxm</artifactId>
			<version>1.5.6</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.ws</groupId>
			<artifactId>spring-ws-core</artifactId>
			<version>1.5.6</version>
		</dependency>
		<!-- End of Spring WS dependencies-->

		<!-- Apache CXF dependencies-->
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-core</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-frontend-simple</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-frontend-jaxws</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-databinding-aegis</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-transports-local</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-transports-http</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-transports-http-jetty</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-transports-jms</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-management</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-common-utilities</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<!-- End of Apache CXF dependencies-->
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.14</version>
		</dependency>
		<!-- JUnit dependency-->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.4</version>
			<scope>test</scope>
		</dependency>
		<!-- End of JUnit dependency-->

	</dependencies>