meta-chip-example-java
==

NextThingCo C.H.I.P. Yocto meta layer example JAVA.

This layer contains JAVA example for the NextThingCo C.H.I.P. board.

This layer depends on the additional layers:
* meta-yocto
* meta-yocto-bsp
* meta-openembedded/meta-oe
* meta-openembedded/meta-python
* meta-openembedded/meta-networking
* meta-chip (from my GitHub https://github.com/myfreescalewebpage/meta-chip)
* meta-java (from http://git.yoctoproject.org/cgit/cgit.cgi/meta-java)


Images
--

The following images are available:
* chip-image-example-java: image with JAVA and Hello World application to test the installation.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/myfreescalewebpage/meta-chip-examples.git ~/yocto/meta-chip-examples
	git clone --branch fido git://git.yoctoproject.org/meta-java.git ~/yocto/meta-java

Add "meta-chip-examples/meta-chip-example-java" and "meta-java" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/myfreescalewebpage/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

After flashing the image on the C.H.I.P. board, the file "helloworld.jar" will be in "/home/root". Execute the following command:

	java -classpath /home/root -jar /home/root/helloworld.jar

The text "Hello World!" in the console indicates that the application is correctly executed.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/myfreescalewebpage/meta-chip
* http://git.yoctoproject.org/cgit/cgit.cgi/meta-java
