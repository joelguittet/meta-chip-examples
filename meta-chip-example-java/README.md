meta-chip-example-java
==

NextThingCo C.H.I.P. Yocto meta layer example JAVA.

This layer contains JAVA example for the NextThingCo C.H.I.P. boards.

This layer depends on the additional layers:
* meta-yocto
* meta-yocto-bsp
* meta-openembedded/meta-oe
* meta-openembedded/meta-python
* meta-openembedded/meta-networking
* meta-chip (from my GitHub https://github.com/joelguittet/meta-chip)
* meta-java (from http://git.yoctoproject.org/cgit/cgit.cgi/meta-java)


Images
--

The following images are available:
* chip-image-example-java-helloworld: image with JAVA and Hello World application to test the installation.
* chip-image-example-java-dio: image with JAVA and GPIO application to show how to drive the hardware from JAVA application.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/joelguittet/meta-chip-examples.git ~/yocto/meta-chip-examples
	git clone --branch morty git://git.yoctoproject.org/meta-java.git ~/yocto/meta-java

Add "meta-chip-examples/meta-chip-example-java" and "meta-java" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/joelguittet/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

### chip-image-example-java-helloworld

After flashing the image on the C.H.I.P. board, the file "helloworld.jar" will be in "/usr/local/java". Execute the following command:

	java -jar /usr/local/java/helloworld.jar

The text "Hello World!" in the console indicates that the application is correctly executed.

### chip-image-example-java-dio

After flashing the image on the C.H.I.P. board, the file "gpio.jar" will be in "/usr/local/java". Connect a LED throw a resitor on the pin PE5 (CSI-D1 on C.H.I.P., LED D1 on C.H.I.P. PRO Dev Kit). Execute the following command:

	java -Djava.security.policy=/home/root/java.policy -jar /usr/local/java/gpio.jar PE5

The LED is blinking several times and the application terminates.

Important note: the policy file is set to permit access to the hardware.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/joelguittet/meta-chip
* http://git.yoctoproject.org/cgit/cgit.cgi/meta-java
