meta-chip-example-c
==

NextThingCo C.H.I.P. Yocto meta layer example C.

This layer contains C example for the NextThingCo C.H.I.P. boards.

This layer depends on the additional layers:
* meta-yocto
* meta-yocto-bsp
* meta-openembedded/meta-oe
* meta-openembedded/meta-python
* meta-openembedded/meta-networking
* meta-chip (from my GitHub https://github.com/myfreescalewebpage/meta-chip)


Images
--

The following images are available:
* chip-image-example-c-helloworld: image with Hello World application.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/myfreescalewebpage/meta-chip-examples.git ~/yocto/meta-chip-examples

Add "meta-chip-examples/meta-chip-example-c" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/myfreescalewebpage/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

### chip-image-example-c-helloworld

After flashing the image on the C.H.I.P. board, the executable "helloworld" will be in "/usr/bin". Execute the following command:

	helloworld

The text "Hello World!" in the console indicates that the application is correctly executed.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/myfreescalewebpage/meta-chip
